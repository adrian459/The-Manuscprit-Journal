/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myart;
/**
 *
 * @author asus
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;
public class MyArt {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<User> user = new ArrayList<>();
        ArrayList<Company> company = new ArrayList<>();
        ArrayList<Criteria> criteria = new ArrayList<>();
        LocalDateTime myDateObj = LocalDateTime.now(); 
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        Scanner input = new Scanner(System.in);
        //Database
        company.add(new Company("Space-X", "1 Rocket Road Hawthorne CA 90250", "Hawthrone USA", "62333", "+90888888", "space-x@gmail.com", "designs, manufactures and launches advanced rockets and spacecraft", "Research & Technology"));
        company.add(new Company("NASA", "300 E Street SW Washington DC 20024-3210", "Washington DC USA", "82333", "+908776555", "nasa@gmail.gov", "brings you the latest news, images and videos from America's space agency, pioneering the future in space exploration", "Research & Technology"));
        company.add(new Company("PT.Dirgantara Indonesia", "Jalan Pajajaran No. 154", "Bandung Indonesia", "625121", "+624532119", "marketing_ptdi@indonesian-aerospace.com", "also known as PTDI is one of the indigenous aerospace companies in Asia with core competences in aircraft design and development, aircraft structure manufacturing, aircraft production, and aircraft services for both civilian and military of light and medium aircraft.", "Aviation"));
        company.add(new Company("PT GMF AeroAsia Tbk", "GMF Management Building 3rd Floor Soekarno Hatta International Airport (CGK)", "Tangerang Indonesia", "626969", "+62215508609", "corporatecommunications@gmf-aeroasia.co.id", "company engaged in the maintenance, repair, and overhaul of aircraft and industrial services", "Aviation"));
        company.add(new Company("HYBE Corporation", "42 Teheran-ro 108-gil, Daechi-dong, Gangnam-gu", "Seoul South Korea", "353535", "+82234440105", "-", "HYBE strive for the world's best entertainment lifestyle platform company based on music", "Entertaiment"));
        
        /*criteria.add(new Criteria(company, "Space-x","Astronaut", 4.0, 7, "Information Technology", "S3", 820000.56, "Flying astronauts to space for NASA, SpaceX’s Dragon spacecraft can also carry commercial astronauts to Earth orbit, the ISS or beyond.", formattedDate));
        criteria.add(new Criteria(company,"NASA","Astronaut", 3.91, 1, "Information Technology", "S1", 820000.56, "Spacecraft being sent to Mars, one carrying a six-person crew and the other the expedition's supplies. The mission would take about 440 days to complete", formattedDate));
        criteria.add(new Criteria(company,"PT.Dirgantara Indonesia","CN235-220 FTB Pilot", 3.95, 0, "Information Technology", "S1", 200000.04, "CN235-220 FTB aircraft test with bioavtur from Bandung Institute Of Technology", formattedDate));
        criteria.add(new Criteria(company,"PT GMF AeroAsia Tbk","Aircraft Maintenance Planning Engineer", 3.95, 2, "Information Technology", "S1", 200000.03, "Planning, monitoring, controlling daily production activities for the aircraft maintenance. Make scheduling of parts/ equipment and tools needs per maintenance schedule.", formattedDate));
        criteria.add(new Criteria(company,"HYBE Corporation","BTS-Member", 1.00, 0, " - ", "Elementary School", 200.01, "Singing in front of stupid people",formattedDate));
        criteria.add(new Criteria(company,"PT GMF AeroAsia Tbk","Aircraft Maintenance Engineer", 3.5, 1, "Aerospace Engineering", "S1", 500000.01, "Install, maintain and repair aircraft engines, airframes system electrical, instrument and radio systems and aircraft structures and surface finishes",formattedDate));
        */
        criteria.add(new Criteria("Space-x","Astronaut", 4.0, 7, "Information Technology", "S3", 820000.56, "Flying astronauts to space for NASA, SpaceX’s Dragon spacecraft can also carry commercial astronauts to Earth orbit, the ISS or beyond.", formattedDate));
        criteria.add(new Criteria("NASA","Astronaut", 3.91, 1, "Information Technology", "S1", 820000.56, "Spacecraft being sent to Mars, one carrying a six-person crew and the other the expedition's supplies. The mission would take about 440 days to complete", formattedDate));
        criteria.add(new Criteria("PT.Dirgantara Indonesia","CN235-220 FTB Pilot", 3.95, 0, "Information Technology", "S1", 200000.04, "CN235-220 FTB aircraft test with bioavtur from Bandung Institute Of Technology", formattedDate));
        criteria.add(new Criteria("PT GMF AeroAsia Tbk","Aircraft Maintenance Planning Engineer", 3.95, 2, "Information Technology", "S1", 200000.03, "Planning, monitoring, controlling daily production activities for the aircraft maintenance. Make scheduling of parts/ equipment and tools needs per maintenance schedule.", formattedDate));
        criteria.add(new Criteria("HYBE Corporation","BTS-Member", 1.00, 0, " - ", "Elementary School", 200.01, "Singing in front of stupid people",formattedDate));
        criteria.add(new Criteria("PT GMF AeroAsia Tbk","Aircraft Maintenance Engineer", 3.5, 1, "Aerospace Engineering", "S1", 500000.01, "Install, maintain and repair aircraft engines; airframes; airframe systems; electrical, instrument and radio systems; and aircraft structures and surface finishes",formattedDate));
        
        //Start APP
        boolean start = true;
        while(start){
            System.out.println("-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-");
            System.out.println("+                                                                              +");
            System.out.println("+                               ---JOBSEEKER.id---                             +");
            System.out.println("+                                  [new ver 7.0]                               +");
            System.out.println("+                                                                              +");
            System.out.println("-=-=-=-=-=-=-=-=-==-=-=-=-=-=-=-=-=-=-=-=-=-=--=-=-=-=-=-=-=-=-=-=-=-==--=-=-=-=");
            System.out.println("[" + formattedDate +"]");
            System.out.println("");
            System.out.println("Please select the available menu : ");
            System.out.println("1). Register New User|");
            System.out.println("2). User Login       |");
            System.out.println("3). Admin            |");
            System.out.println("4). Exit             |");
            System.out.println("");
            System.out.print("Select number : ");
            int selection = input.nextInt();
            System.out.println("");
            switch(selection){
                case 1:
                    System.out.println("+==============================================================================+");
                    System.out.println("+                          ***Register New User***                             +");
                    System.out.println("+==============================================================================+");
                    System.out.println("[" + formattedDate +"]");
                    addUser(user, input);
                    System.out.println("");
                    System.out.println("[Account created successfully]");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("-----------------[Login User]------------------");
                    System.out.println("[" + formattedDate +"]");
                    startApplication(user, company, criteria, input, formattedDate);
                    
                    break;
                case 3:
                    System.out.println("+==============================================================================+");
                    System.out.println("+                              ***Login Admin***                               +");
                    System.out.println("+==============================================================================+");
                    System.out.println("[" + formattedDate +"]");
                    System.out.println("");
                    input.nextLine();
                    System.out.print("Enter Username : ");
                    String username = input.nextLine();
                    System.out.print("Enter Password : ");
                    String pass = input.nextLine();
                    System.out.println("");
                    if("arman_ganteng".equals(pass)){
                        admin(user, company, criteria, input, formattedDate, username);
                    }
                    //userList(user);
                    break;
                default:
                    start = false;
                    break;
            }
        }
        System.out.println("Thank you for using our service, have a nice day :) ");
        /*System.out.println(criteria.get(0).getCompany().get(1).getNamaPerusahaan());
        System.out.println(criteria.get(0).getMajor());
        System.out.println(criteria.get(0).getSalary());
        company.remove(4);*/
        //ListOfCompany(company);
    }
    //----------------------------------------------------------------------------------//
    //----------------------------------------------------------------------------------//
    //Function & Procedure :)
    public static void admin(ArrayList<User> user, ArrayList<Company> company, ArrayList<Criteria> criteria, Scanner input, String formattedDate, String username){
        boolean admin = true;
        while(admin){
            System.out.println("+-----------------------------[Welcome "+username+"]----------------------------------+");
            System.out.println("[" + formattedDate +"]");
            System.out.println("");
            System.out.println("Please select the available menu : ");
            System.out.println("1). Show User List        |");
            System.out.println("2). Show Company List     |");
            System.out.println("3). Show Job Vacancy List |");
            System.out.println("4). Data Manipulation     |");
            System.out.println("5). Exit                  |");
            System.out.println("");
            System.out.print("Select number : ");
            int select = input.nextInt();
            System.out.println("");
            switch(select){
                case 1:
                    userList(user);
                    break;
                case 2:
                    ListOfCompany(company);
                    break;
                case 3:
                    jobList(criteria);
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("================================[Data Manipulation Privilege]=================================");
                    System.out.println("1). Remove All User       3).Remove All Company       7).Remove All Job Vacancy               ");
                    System.out.println("2). Remove Spesific User  4).Remove Specific Company  8).Remove Specific Job Vacancy          ");
                    System.out.println("                          5).Updating Company Data    9).Update Job Vacancy Data              ");
                    System.out.println("                          6).Add Company             10).Add Job Vacancy                      ");
                    System.out.println("==============================================================================================");
                    System.out.println("");
                    System.out.print("Select number : ");
                    int x = input.nextInt();
                    switch(x){
                    case 1:
                        user.clear();
                    case 2:
                        System.out.println("+---[Remove Specific User]---+");
                        System.out.println("");
                        input.nextLine();
                        System.out.print("Enter Username : ");
                        String user_name = input.nextLine();
                        System.out.print("Enter Email    : ");
                        String email = input.nextLine();
                        for(int i = 0; i < user.size(); i++){
                            if(user_name.equalsIgnoreCase(user.get(i).getName()) && email.equalsIgnoreCase(user.get(i).getEmail())){
                                user.remove(i);
                            }
                        }
                        break;
                    case 3:
                        company.clear();
                        criteria.clear();
                        break;
                    case 4:
                        System.out.println("+---[Remove Specific Company]---+");
                        System.out.println("");
                        input.nextLine();
                        System.out.print("Enter Company Name : ");
                        String company_name = input.nextLine();
                        for(int i = 0; i < company.size(); i++){
                            if(company_name.equalsIgnoreCase(company.get(i).getNamaPerusahaan())){
                                company.remove(i);
                            }
                        }
                        for(int j = 0; j < criteria.size(); j++){
                            if(company_name.equals(criteria.get(j).getCompanyName())){
                                criteria.remove(j);
                            }
                        }
                        break;
                    case 5:
                        System.out.println("+---[Update Data Company]---+");
                        System.out.println("");
                        input.nextLine();
                        System.out.print("Enter Company Name : ");
                        String companyname = input.nextLine();
                        for(int i = 0; i < company.size(); i++){
                            if(companyname.equalsIgnoreCase(company.get(i).getNamaPerusahaan())){
                                System.out.println("[Company Data Found]");
                                System.out.print("Input Company name : ");
                                String companyName = input.nextLine();
                                System.out.print("Input Address      : ");
                                String companyAddress = input.nextLine();
                                System.out.print("Input City         : ");
                                String companyCity = input.nextLine();
                                System.out.print("Input Postal Code  : ");
                                String companyPost = input.nextLine();
                                System.out.print("Input Number Phone : ");
                                String companyPhone = input.nextLine();
                                System.out.print("Input Email        : ");
                                String companyEmail = input.nextLine();
                                System.out.print("Input Company Info : ");
                                String companyInfo = input.nextLine();
                                System.out.print("Input Company Field: ");
                                String companyField = input.nextLine();
                                System.out.println("");
                                System.out.println("[Data Updated On : " + formattedDate + "]");
                                System.out.println("");
                                company.get(i).setNamaPerusahaan(companyName);
                                company.get(i).setAddress(companyAddress);
                                company.get(i).setCity(companyCity);
                                company.get(i).setPostalCode(companyPost);
                                company.get(i).setPhone(companyPhone);
                                company.get(i).setEmail(companyEmail);
                                company.get(i).setInfo(companyInfo);
                                company.get(i).setField(companyField);
                            }
                        }
                        break;
                    case 6:
                        addCompany(company, input);
                        break;
                    case 7:
                        criteria.clear();
                        break;
                    case 8:
                        System.out.println("+---[Remove Specific Job Vacancy]---+");
                        System.out.println("");
                        input.nextLine();
                        System.out.print("Enter Company Name : ");
                        String compName = input.nextLine();
                        System.out.print("Enter Job Desk     : ");
                        String jobDesk = input.nextLine();
                        for(int i = 0; i < criteria.size(); i++){
                            if(compName.equalsIgnoreCase(criteria.get(i).getCompanyName()) && jobDesk.equalsIgnoreCase(criteria.get(i).getJobDesk())){
                                criteria.remove(i);
                            }
                        }
                        break;
                    case 9:
                        System.out.println("+---[Update Data Job Vacancy]---+");
                        System.out.println("");
                        input.nextLine();
                        System.out.print("Enter Job Desk Name : ");
                        String jobName = input.nextLine();
                        System.out.print("Enter Company Name  : ");
                        String nameCompany = input.nextLine();
                        for(int i = 0; i < criteria.size(); i++){
                            if(jobName.equalsIgnoreCase(criteria.get(i).getJobDesk()) && nameCompany.equalsIgnoreCase(criteria.get(i).getCompanyName())){
                                System.out.println("[Job Vacancy Found]");
                                criteria.remove(i);
                                /*System.out.print("Input Company name : ");
                                String companyName = input.nextLine();
                                System.out.print("Input Job Desk     : ");
                                String deskJob = input.nextLine();
                                System.out.print("Input Min GPA      : ");
                                double gpa = input.nextDouble();
                                System.out.print("Input Min Work Exp : ");
                                int exp = input.nextInt();
                                System.out.print("Input Major        : ");
                                String major = input.nextLine();
                                input.nextLine();
                                System.out.print("Input Title        : ");
                                String title = input.nextLine();
                                System.out.print("Input Salary       : ");
                                double salary = input.nextDouble();
                                System.out.print("Input Job Desk Info: ");
                                String info = input.nextLine();
                                criteria.get(i).setCompanyName(companyName);
                                criteria.get(i).setJobDesk(deskJob);
                                criteria.get(i).setMinGPA(gpa);
                                criteria.get(i).setMinWorkExp(exp);
                                criteria.get(i).setMajor(major);
                                criteria.get(i).setTitle(title);
                                criteria.get(i).setSalary(salary);
                                criteria.get(i).setInfo(info);
                                System.out.println("");
                                System.out.println("[Data Updated On : " + formattedDate + "]");
                                System.out.println("");*/
                                //Criteria(String companyName,String jobDesk, double minGPA, int minWorkExp, String major, String title, double salary, String info, String releaseDate
                            }
                        }
                        addCriteria(criteria, input, formattedDate);
                        System.out.println("");
                        System.out.println("[Data Updated On : " + formattedDate + "]");
                        System.out.println("");
                        break;
                    case 10:
                        addCriteria(criteria, input, formattedDate);
                        break;
                    default:
                        break;
                    }
                default :
                admin = false;
                break;
                    
                }
            }
        }        
    public static void addCompany(ArrayList<Company> company, Scanner input){
        input.nextLine();
        System.out.print("Input Company name : ");
        String companyName = input.nextLine();
        System.out.print("Input Address      : ");
        String companyAddress = input.nextLine();
        System.out.print("Input City         : ");
        String companyCity = input.nextLine();
        System.out.print("Input Postal Code  : ");
        String companyPost = input.nextLine();
        System.out.print("Input Number Phone : ");
        String companyPhone = input.nextLine();
        System.out.print("Input Email        : ");
        String companyEmail = input.nextLine();
        System.out.print("Input Company Info : ");
        String companyInfo = input.nextLine();
        System.out.print("Input Company Field: ");
        String companyField = input.nextLine();
        System.out.println("");
        company.add(new Company(companyName, companyAddress, companyCity, companyPost, companyPhone, companyEmail, companyInfo, companyField));
    }
    public static void addCriteria(ArrayList<Criteria> criteria, Scanner input, String formattedDate){
        input.nextLine();
        System.out.print("Input Company name         : ");
        String companyName = input.nextLine();
        System.out.print("Input Job Desk             : ");
        String jobDesk = input.nextLine();
        System.out.print("Input Min GPA              : ");
        double GPA = input.nextDouble();
        System.out.print("Input Min Work Experience  : ");
        int minWorkExp = input.nextInt();
        System.out.print("Input Major                : ");
        String major = input.next();
        input.nextLine();
        System.out.print("Input Title                : ");
        String title = input.nextLine();
        System.out.print("Input Salary               : ");
        double salary = input.nextDouble();
        System.out.print("Input Job Desk Info        : ");
        String info = input.next();
        criteria.add(new Criteria(companyName, jobDesk, GPA, minWorkExp, major, title, salary, info, formattedDate));
        //Criteria(String companyName,String jobDesk, double minGPA, int minWorkExp, String major, String title, double salary, String info, String releaseDate)
    } 
    public static void ListOfCompany(ArrayList<Company> company){
        for (int i = 0; i < company.size(); i++) {
            System.out.println("Company name :"+ company.get(i).getNamaPerusahaan());
            System.out.println("Address      :"+ company.get(i).getAddress());
            System.out.println("City         :"+ company.get(i).getCity());
            System.out.println("Postal Code  :"+ company.get(i).getPostalCode());
            System.out.println("Phone        :"+ company.get(i).getPhone());
            System.out.println("Email        :"+ company.get(i).getEmail());
            System.out.println("Info         :"+ company.get(i).getInfo());
            System.out.println("Field        :"+ company.get(i).getField());
            System.out.println(" ");
        }        
    }
     public static void addUser(ArrayList<User> user, Scanner input){
         input.nextLine();//biar gk ke skip inputanya 
         System.out.print("Enter your name : ");
         String name = input.nextLine();
         System.out.print("Gender          : ");
         String gender = input.nextLine();
         System.out.print("Birthplace      : ");
         String place = input.nextLine();
         System.out.print("Birthdate       : ");
         String birthdate = input.nextLine();         
         System.out.print("Address         : ");
         String address = input.nextLine();
         System.out.print("Phone           : ");
         String phone = input.nextLine();
         System.out.print("Email           : ");
         String email = input.nextLine();
         System.out.print("Create Password : ");
         String password = input.nextLine();
         user.add(new User(name, gender, place, birthdate, address, phone, email, password));
     }
     public static void userList(ArrayList<User> user){
         for (int i = 0; i < user.size(); i++) {
            System.out.println("User name   :"+ user.get(i).getName());
            System.out.println("Gender      :"+ user.get(i).getGender());
            System.out.println("Birthplace  :"+ user.get(i).getBirthplace());
            System.out.println("Birthdate   :"+ user.get(i).getBirthdate());
            System.out.println("Address     :"+ user.get(i).getAddress());
            System.out.println("Phone       :"+ user.get(i).getPhone());
            System.out.println("Email       :"+ user.get(i).getEmail());
            System.out.println("Password    :*******");
            System.out.println(" ");
        }        
     }
     public static void jobList(ArrayList<Criteria> criteria){
         for(int i = 0; i < criteria.size(); i++){
             System.out.println("Company name            :"+ criteria.get(i).getCompanyName());
             System.out.println("Job Vacancy             :"+ criteria.get(i).getJobDesk());
             System.out.println("Job description         :"+ criteria.get(i).getInfo());
             System.out.println("Salary                  :$"+ criteria.get(i).getSalary() +" per month");
             System.out.println("Release Date            :"+ criteria.get(i).getReleaseDate());
             System.out.println("---Requirements---");
             System.out.println("Minimum GPA             :"+ criteria.get(i).getMinGPA());
             System.out.println("Minimum work experience :"+ criteria.get(i).getMinWorkExp());
             System.out.println("Major                   :"+ criteria.get(i).getMajor());
             System.out.println("Minimum Title           :"+ criteria.get(i).getTitle());
             System.out.println("");
         }
     }
     public static void startApplication(ArrayList<User> user, ArrayList<Company> company, ArrayList<Criteria> criteria, Scanner input, String formattedDate){
         input.nextLine();
         System.out.print("Enter Name     :");
         String name = input.nextLine();
         System.out.print("Enter Password :");
         String password = input.nextLine();
         System.out.println("");
         for(int i = 0; i < user.size(); i++){
             if(password.equals(user.get(i).getPassword())){
                 boolean start = true;
                 while(start){
                     System.out.println("+=-=-=-=-=-=-=-=-=[WELCOME TO JOBSEEKER.id]=-=-=-=-=-=-=-=-=+");
                     System.out.println("[" + formattedDate +"]");
                     System.out.println("User name   :"+ user.get(i).getName());
                     System.out.println("Gender      :"+ user.get(i).getGender());
                     System.out.println("Email       :"+ user.get(i).getEmail());
                     System.out.println("");
                     System.out.println("Please select the available menu : ");
                     System.out.println("1). Show Company List     |");
                     System.out.println("2). Show Job Vacancy List |");
                     System.out.println("3). Enroll                |");
                     System.out.println("4). Log Out               |");
                     System.out.println("");
                     System.out.print("Select number : ");
                     int selection = input.nextInt();
                     System.out.println("");
                     switch(selection){
                             case 1:
                                 System.out.println("+=-=-=-=-=-=-=-=-=[Company List]=-=-=-=-=-=-=-=-=+");
                                 System.out.println("[" + formattedDate +"]");
                                 ListOfCompany(company);
                                 break;
                             case 2:
                                 System.out.println("+=-=-=-=-=-=-=-=-=[Job Vacancy List]=-=-=-=-=-=-=-=-=+");
                                 System.out.println("[" + formattedDate +"]");
                                 jobList(criteria);
                                 break;
                             case 3:
                                 System.out.println("=-=-=-=-=-=-=-=-=[Enrollment]=-=-=-=-=-=-=-=-=+");
                                 System.out.println("[" + formattedDate +"]");
                                 System.out.println("");
                                 System.out.println("Please enter company name and job position :");
                                 System.out.println("");
                                 input.nextLine();
                                 System.out.print("Enter Company Name  : ");
                                 String companyName = input.nextLine();
                                 System.out.print("Enter Job Posistion : ");
                                 String jobPosition = input.nextLine();
                                 System.out.println("");
                                 for(int j = 0; j < criteria.size(); j++){
                                     if(companyName.equalsIgnoreCase(criteria.get(j).getCompanyName()) && jobPosition.equalsIgnoreCase(criteria.get(j).getJobDesk())){
                                         //Do something
                                         System.out.println("=-=-=-=-=-=-=-=-=[Create CV]=-=-=-=-=-=-=-=-=+");
                                         System.out.println("[" + formattedDate +"]");
                                         System.out.print("Enter your GPA           : ");
                                         double gpa = input.nextDouble();
                                         input.nextLine();//Biar gk loncat
                                         System.out.print("Enter your major         : ");
                                         String major = input.nextLine();
                                         System.out.print("Work experience in years : ");
                                         int workExp = input.nextInt();
                                         input.nextLine();//Biar gk loncat
                                         System.out.print("Enter your title         : ");
                                         String title = input.nextLine();
                                         System.out.println("");
                                         System.out.println("=-=-=-=-=-=-=-=-=[Result]=-=-=-=-=-=-=-=-=+");
                                         System.out.println("[" + formattedDate +"]");
                                         System.out.println("");
                                         Qualification Q = new Qualification(gpa, major, workExp, title, user.get(i).getName(), user.get(i).getGender(), user.get(i).getBirthplace(), user.get(i).getBirthdate(), user.get(i).getAddress(), user.get(i).getPhone(), user.get(i).getEmail(), user.get(i).getPassword());
                                         criteria.get(j).setQualification(Q); //
                                         boolean isAccepted = criteria.get(j).isAccepted(major, title, workExp, gpa);
                                         if(isAccepted == true) {
                                            System.out.println("Selamat, "+ criteria.get(j).getQualification().getName() +"! Anda diterima dan akan masuk ke tahap interview!");
                                         }else {
                                            System.out.println("Maaf, "+ criteria.get(j).getQualification().getName() +". Kamu belum memenuhi kriteria perusahaan ini. Tetap semangat dan sampai jumpa di lain waktu. :)");
                                         }
                                         System.out.println("");
                                     }
                                 }
                                 break;
                             default:
                                 start = false;
                                 break;
                     }
                 }
             }
         }
     }
}