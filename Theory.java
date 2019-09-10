public class Theory
{
	private int weapon;
	private int location;
	private int person;
	
	public Theory (int weapon, int location, int person)
	{
		this.weapon = weapon;
		this.location = location;
		this.person = person; 
	}
	
	public Theory(Theory other)
	{
		this.weapon = other.weapon;
		this.location = other.location;
		this.person = other.person; 
	}
	//getter get weapon
	public int getWeapon()
	{
		return weapon;
	}
	//setter set weapon
	public void setWeapon(int weapon)
	{
		this.weapon = weapon;
	}
	//getter get location
	public int getLocation()
	{
		return location;
	}
	//setter set location
	public void setLocation(int location)
	{
		this.location = location;
	}
	//getter get person
	public int getPerson()
	{
		return person;
	}
	//setter set person
	public void setPerson(int person)
	{
		this.person = person;
	}
	
	//override
	
	public boolean equals(Object obj)
	{
		if(obj == null || this.getClass() != obj.getClass())
		{
			return false;
		}
		Theory other = (Theory)obj;
		return (this.weapon != other.weapon || this.location != other.location || this.person != other.person);
	}
	
	//override
	public String toString()
	{
		return String.format("Theory is: Weapon = %s(%d), Person = %s(%d), Location = %s(%d), TheoryItem.getWeaponName(this.weapon), this.weapon, TheoryItem.getPersonName(this.peroson),this.person, TheoryItem.getLocationName(this.location), this.location");
	}
	
}