package util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author cassio
 */
public class Util {
    public Util(){}
    
    Calendar cal = new GregorianCalendar();
    //Método para recuperar a data do sistema
    public String dataSistema(){
        String data = "";
        
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        
        data = dia+"/"+(mes+1)+"/"+ano;
        
        return data;
    }
    
    //Método para recuperar a hora do sistema
    public String horarioSistema(){
        String horario = "";
        
        int hora = cal.get(Calendar.HOUR);
        int minuto = cal.get(Calendar.MINUTE);
        int segundo = cal.get(Calendar.SECOND);
        
        horario = hora+":"+minuto+":"+segundo;
        
        return horario;
    }
    
    //Método para verificar placa 
    public boolean isPlaca(String placa){
        
        if(placa.length() == 7){
            return true;
        }
        
        return false;
    }
}
