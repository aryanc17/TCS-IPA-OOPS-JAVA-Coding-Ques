import java.util.*;
public class IPA16 {
    
    static RRT getHighestPriorityTicket(RRT[] arr, String project){
        int min = arr[0].getPriority();

        for(int i =0; i<arr.length; i++){
            if(arr[i].getProject().equalsIgnoreCase(project)){
                if(arr[i].getPriority() < min){
                    min = arr[i].getPriority();
                }
            }
        }

        for(int i =0; i<arr.length; i++){
            if(arr[i].getProject().equalsIgnoreCase(project)){
                if(arr[i].getPriority() == min){
                    return arr[i];
                }
            }
           
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RRT[] arr = new RRT[4];

        for(int i=0; i<4; i++)
        {
            int a = sc.nextInt();sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            int d = sc.nextInt();sc.nextLine();
            String e = sc.nextLine();

            arr[i]=new RRT(a,b,c,d,e);
        };

        String project = sc.nextLine();

        RRT ans = getHighestPriorityTicket(arr, project);

        if(ans == null) System.out.println("No such Ticket");

        else{
            System.out.println(ans.getTicketNo());
            System.out.println(ans.getRaisedBy());
            System.out.println(ans.getAssignedTo());
        }

        sc.close();
    }
}

class RRT
{
    private int ticketNo, priority;
    private String raisedBy, assignedTo, project;
    public RRT(int ticketNo, String raisedBy, String assignedTo, int priority, String project)
    {
        this.ticketNo = ticketNo;
        this.raisedBy = raisedBy;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.project = project;
    }
    public int getTicketNo()
    {
        return ticketNo;
    }
    public void setTicketNo(int ticketNo)
    {
        this.ticketNo = ticketNo;
    }
    public String getRaisedBy()
    {
        return raisedBy;
    }
    public void setRaisedBy(String raisedBy)
    {
        this.raisedBy = raisedBy;
    }
    public String getAssignedTo()
    {
        return assignedTo;
    }
    public void setAssignedTo(String assignedTo)
    {
        this.assignedTo = assignedTo;
    }
    public int getPriority()
    {
        return priority;
    }
    public void setPriority(int priority)
    {
        this.priority = priority;
    }
    public String getProject()
    {
        return project;
    }
    public void setProject(String project)
    {
        this.project = project;
    }
}
