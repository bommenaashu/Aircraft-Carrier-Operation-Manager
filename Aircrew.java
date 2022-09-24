/*
 * Class Name:    Aircraft
 *
 * Author:        Your Name
 * Creation Date: Tuesday, April 23 2019, 15:32 
 * Last Modified: Wednesday, April 24 2019, 18:52
 * 
 * Class Description:
 *    This is the Aircraft class for the OOF Assignment C, Semester 1
 *    2019
 *
 *    An Aircraft may have one Aircrew. When the Aircraft is created 
 *    from the keyboard all we require is the tail code (after checking
 *    the the tail code is unique). The crew object reference must
 *    be empty and the status must be "on deck"
 *
 *    Writing some helper methods (public) might be useful
 *    For example, it might be useful to have a method that 
 *    returns true/false about whether this object already has a
 *    crew object associated with it. That is, can it add a crew.
 *    If there is already a crew then no.
 *
 *    Another method that might be useful is a method that returns
 *    true/false if the aircrew of this aircraft has the required
 *    status level to carry out the mission. The parameter that comes
 *    from the Carrier object would the user entered mission requirement
 *    String.
 *
 *    Other methods that this class requires are detailed in the 
 *    assignment.
 *
 */

public class Aircrew
{
  private String name;
  private String callSign;
  private int missions;
  private String status;

  public Aircrew(String name, String callSign, int missions)
  {
    this.name = name;
    this.callSign = callSign;
    this.missions = missions;
    setStatus();
  }

  public Aircrew(String name, String callSign)
  {
    this.name = name;
    this.callSign = callSign;
    this.missions = 0;
    setStatus();
  }

  private void setStatus()
  {
    if(missions<=5)
    {
     status = "Rookie";
    }
    else if(missions<=10)
    {
     status = "Trained";
    }
    else if(missions<=16)
    {
     status = "Veteran";
    }
    else if(missions>16)
    {
      status = "Ace pilot";
    }
  }

  public String getName()
  {
    return name;
  }
  
  public String getCallSign()
  {
    return callSign;
  }
  
  public int getMissions()
  {
    return missions;
  }

  public String getStatus()
  {
   return status;
  }

 public setMissions()
 {
   ++missions;
 } 

  public String toString()
  {
    String description = "[Name: "+name+ "\n Call Sign: "+callSign+ "\n Missions: "+missions+ "\n Status: "+status+]"; 
    return description;
  }
}
