package listnersDeno;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class requestAttributeListnerForRandomServlet implements ServletRequestListener, ServletRequestAttributeListener {

    public requestAttributeListnerForRandomServlet() {
        // TODO Auto-generated constructor stub
    }

    public void requestInitialized(ServletRequestEvent sre)  { 
        // TODO Auto-generated method stub
    	System.out.println("request initialized.....");
    }
    
    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
    	System.out.println("request destroyed.....");

    }

    public void attributeRemoved(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	System.out.println("request attributeDeleted.....");

    }
    
    public void attributeAdded(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	System.out.println("request attributeAdded....."+ srae.getName() +srae.getValue()+ srae.getSource());

    }

    public void attributeReplaced(ServletRequestAttributeEvent srae)  { 
         // TODO Auto-generated method stub
    	System.out.println("request attributeReplaced....."+ srae.getName() +srae.getValue()+ srae.getSource());

    }
	
}
