package ec.edu.uce.Proyecto_004;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import ec.edu.uce.Proyecto_004.models.Dao;
import ec.edu.uce.Proyecto_004.models.Students;
import ec.edu.uce.Proyecto_004.models.Subjects;
import ec.edu.uce.Proyecto_004.view.BaseFrame;


public class App 
{
	
    public static void main( String[] args ){
    	
    	try {
			BaseFrame frame = new BaseFrame();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
			
			
		
		
    }
}
