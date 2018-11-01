/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.intelligt.modbus.jlibmodbus.exception.ModbusIOException;
import com.intelligt.modbus.jlibmodbus.exception.ModbusNumberException;
import com.intelligt.modbus.jlibmodbus.exception.ModbusProtocolException;
import com.intelligt.modbus.jlibmodbus.master.ModbusMaster;
import com.intelligt.modbus.jlibmodbus.master.ModbusMasterFactory;
import com.intelligt.modbus.jlibmodbus.serial.SerialParameters;
import com.intelligt.modbus.jlibmodbus.serial.SerialPort;
import com.intelligt.modbus.jlibmodbus.serial.SerialPortException;
import com.intelligt.modbus.jlibmodbus.serial.SerialPortFactoryJSerialComm;
import com.intelligt.modbus.jlibmodbus.serial.SerialUtils;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Observable;

/**
 *
 * @author FernandoMagro
 */
public class ModbusServer extends Observable {
    private SerialParameters sp;
    
    ModbusMaster m;
    private int slaveId;
    private int[] inputRegisters;
    
    private float temperatura;
    
    private ArrayList<Float> channels = new ArrayList<Float>();
    
    private float voltage;
    private float internalTemperature;
    
    public ModbusServer(String serialPort) {
        slaveId = 1;
        sp = new SerialParameters();
        
        sp.setDevice(serialPort);
        sp.setBaudRate(SerialPort.BaudRate.BAUD_RATE_9600);
        sp.setDataBits(8);
        sp.setParity(SerialPort.Parity.NONE);
        sp.setStopBits(1);
        
        SerialUtils.setSerialPortFactory( new SerialPortFactoryJSerialComm());
    }
    
    public void connect() throws SerialPortException, ModbusIOException {
        m = ModbusMasterFactory.createModbusMasterRTU(sp);
        m.connect();
    }
    
    public float getTemp() {
        return temperatura;
    }
    
    public void debug() {
        System.out.println("rodando.." + new Date());
    }
    
    public void update() throws ModbusProtocolException, ModbusNumberException, ModbusIOException {
        int startAddress = 0;
        int quantity = 27;
        int combined;
        
        inputRegisters = m.readInputRegisters(slaveId, startAddress, quantity);
        
        for(int i=0; i<=12; i++) {
            combined = (inputRegisters[i]<<16) | inputRegisters[i+1];
            channels.
        }
        
        combined = (inputRegisters[0]<<16) | inputRegisters[1];
        temperatura = Float.intBitsToFloat(combined);
        
        channel[0] = temperatura;

        setChanged();
        notifyObservers(channel); // argumento é passado para os observers
    }
    

    
}
