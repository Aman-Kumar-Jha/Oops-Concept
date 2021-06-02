package Encapsulation;

public class Encapsulate 
{ 
    
    private String geekName; 
    private int geekUid; 
    private int geekAge; 
  
   
    /**
	 * @return the geekName
	 */
	public final String getGeekName() {
		return geekName;
	}


	/**
	 * @param geekName the geekName to set
	 */
	public final void setGeekName(String geekName) {
		this.geekName = geekName;
	}


	/**
	 * @return the geekRoll
	 */
	public final int getGeekUid() {
		return geekRoll;
	}
 

	/**
	 * @param geekRoll the geekRoll to set
	 */
	public final void setGeekUid(int geekUid) {
		this.geekUid = geekUid;
	}


	/**
	 * @return the geekAge
	 */
	public final int getGeekAge() {
		return geekAge;
	}


	/**
	 * @param geekAge the geekAge to set
	 */
	public final void setGeekAge(int geekAge) {
		this.geekAge = geekAge;
	}


	public int getAge()  
    { 
      return geekAge; 
    } 
   
    
    public String getName()  
    { 
      return geekName; 
    } 
  
    public int getUid()  
    { 
       return geekUid; 
    } 
   
  
    public void setAge( int newAge) 
    { 
      geekAge = newAge; 
    } 
   
    
    public void setName(String newName) 
    { 
      geekName = newName; 
    } 
      
   
    public void setUid( int newUid)  
    { 
      geekUid = newUid; 
    } 
} 