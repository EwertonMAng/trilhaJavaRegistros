package javaPilhaOuStack;
public class FluxoComTratamento {	
	    public static void main(String[] args) {
	        System.out.println("Ini do main");
	        try {
	        	metodo1();
	        }	        
	        catch(Exception ex) {
	        	String msg = ex.getMessage();
            	System.out.println("Exception " + msg);
	        	ex.printStackTrace();
            }
	        System.out.println("Fim do main");
	    }

	    private static void metodo1() {
	        System.out.println("Ini do metodo1");	       
	        	metodo2();	        
	        System.out.println("Fim do metodo1");
	    }
	    private static void metodo2() {
	        System.out.println("Ini do metodo2");
	        for(int i = 1; i <= 5; i++) {
	            System.out.println(i);
	            //int a = i / 0;
	            Conta c = null;
	            try {
	            	 c.deposita();	
	            }
	            catch(MinhaException ex) {
	    			System.out.println("Tratamento.....");
	    		}
	        }
	        System.out.println("Fim do metodo2");
	    }		
	
}
