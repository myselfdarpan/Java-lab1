import java.util.Scanner;

class staff
{
    String StaffId, Name, Phone, Salary;

    Scanner sc = new Scanner(System.in);

    void read()
    {
        System.out.println("Enter the staff Id: ");
        StaffId = sc.nextLine();
        System.out.println("Enter the name: ");
        Name = sc.nextLine();
        System.out.println("Enter phone: ");
        Phone = sc.nextLine();
        System.out.println("Enter salary: ");
        Salary = sc.nextLine();
    }

    void display()
    {
        System.out.println("\t STAFFID\t NAME\t PHONE\t SLARY");
        System.out.println("\t"+StaffId+"\t"+Name+"\t"+Phone+"\t"+Salary);
    }
}

class Teaching extends staff
{
    String Domain,Publication;

    void read_Teaching()
    {
        super.read();
        System.out.println("Enter domain: ");
        Domain = sc.nextLine();
        System.out.println("Enter Publication: ");
        Publication = sc.nextLine();
    }

    void display()
    {
        super.display();
        System.out.println("\t DOMAIN \t PUBLICATION");
        System.out.println("\t"+Domain+"\t"+Publication);
    }
}

class Technical extends staff
{
    String Skills;

    void read_Technical()
    {
        super.read();
        System.out.println("Enter skills: ");
        Skills = sc.nextLine();

    }

    void display()
    {
        super.display();
        System.out.println("\t SKILLS");
        System.out.println("\t"+Skills);
    }
}

class Contract extends staff
{
    String Period;
    void read_Contract()
    {
        super.read();
        System.out.println("Enter Period: ");
        Period = sc.nextLine();

    }

    void display()
    {
        super.display();
        System.out.println("\t PERIOD");
        System.out.println("\t"+Period);
    }
}


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of staff details to be created: ");
        int n = sc.nextInt();
        Teaching steach[] = new Teaching[n];
        Technical stech[] = new Technical[n];
        Contract scon[] = new Contract[n];

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Teaching STaff information: ");
            steach[i] = new Teaching();
            steach[i].read_Teaching();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Technical Staff information: ");
            stech[i] = new Technical();
            stech[i].read_Technical();
        }

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter COntract Staff Information: ");
            scon[i] = new Contract();
            scon[i].read_Contract();
        }

        System.out.println("STAFF DETAILS");
        System.out.println("Teaching Staff details ");

        for(int i=0;i<n;i++)
        {
            steach[i].display();
        }
        System.out.println();
        System.out.println("Technical Staff Details: ");
        for(int i=0;i<n;i++)
        {
            stech[i].display();
        }
        System.out.println();
        System.out.println("Contract staff details: ");
        for(int i=0;i<n;i++)
        {
            scon[i].display();
        }

        sc.close();
    }
}
