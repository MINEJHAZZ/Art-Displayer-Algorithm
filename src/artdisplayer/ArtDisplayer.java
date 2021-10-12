/*
Art Display Algorithm was Designed by MINEJHAZZ(Aka. Jhazzmear John B. Saytas) 
https://github.com/MINEJHAZZ
*/

//To make the code run smoother, please run it using cmd with the command line "java "path/to/file""

//Only Use if you are using netbeans
//package artdisplayer;

//Imports/Resources needed
import java.util.*;
import java.util.concurrent.*;

public class ArtDisplayer {
    
//Line Breaks
static void FN(){
  System.out.print("\n\n\n\n");
}

static void TN(){
  System.out.println("\n");
}

static void SN(){
  System.out.print("\n");
}

//Sleeper/Pending
static void TT()throws InterruptedException{
  TimeUnit.SECONDS.sleep(2);
}

//Array Displayer V3
static void PrintArr2(String[] CLoad) throws InterruptedException{
int stm = 5;
    for (String CLoad1 : CLoad) {
        System.out.print(CLoad1);
        TimeUnit.MILLISECONDS.sleep(stm);
    }
  SN();
}

//Array Displayer Algorithm
static void DS4() throws InterruptedException{

//Arrays/Image to display
String L1S = "                         ,&&&&&&&&&&&&&&.                                                                     %&&&&&&&&&&&@&&                         ";
String L2S = "                       @@@@@@@@@@@@@@@@@@@@                                                                /@@@@@@@@@@@@@@@@@@@/                      ";
String L3S = "                     &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,                    ";
String L4S = "                   ,@@@@@@@@@@@@@@@@@@@@@@@@@@& ,@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@& ,@@@@@@@@@@@@@@@@@@@@@@@@@@&                   ";
String L5S = "                  %@@@@@%.              #@@@@@& ,@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@& ,@@@@@@,              (@@@@@@.                 ";
String L6S = "                 @@@@&      *@@@@@@@%      #@@@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@@@@@.      *@@@@@@       *@@@@*                ";
String L7S = "                @@@@        *@@@@@@@%        %@@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@@@.       .@@@@@@@@        /@@@*               ";
String L8S = "               &@@#         *@@@@@@@#         /@@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@@           @@@@@&           @@@.              ";
String L9S = "              (@@@  .@@@@@@@@ ,@@@/ &@@@@@@@/  &@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@.   &@@@@@         .@@@@@%   /@@@              ";
String L10S = "             .@@@&  .@@@@@@@@@@.  @@@@@@@@@@/  (@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@   @@@@@@@@       .@@@@@@@%  .@@@%             ";
String L11S = "             @@@@@  .@@@@@@@@* &@@ .@@@@@@@@/  %@@@@ @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ (@@@@   .@@@@@@.        /@@@@@@   *@@@@,            ";
String L12S = "            %@@@@@(         ,@@@@@@@(         ,@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&           &@@@@/           @@@@@@            ";
String L13S = "           ,@@@@@@@%        *@@@@@@@%        /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         @@@@@@@@        .@@@@@@@&           ";
String L14S = "           @@@@@@@@@@/      *@@@@@@@%      ,@@@@*        .#@@@@@@@@@@@@@,&&*@,%@@@@@@@@@@@@@*        ,%@@@%       #@@@@@@,       @@@@@@@@@@*          ";
String L15S = "          /@@@@@@@@@@@@@*               ,@@@@   .%@@@@@@@/   /@@@@@@@@@@@*/@.@@@@@@@@@@@&   .&@@@@@@@*   (@@@(               .%@@@@@@@@@@@@@          ";
String L16S = "          @@@@@@@@@@@@@@@@@@@@%(//#@@@@@@@@.  &@@@@@@@@@@@@@,  %@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@,  &@@@@@@@%(//#&@@@@@@@@@@@@@@@@@@@/         ";
String L17S = "         #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.  @@@@@@@@@@@@@@@@#  @@@@@@@@@@/,&@@@@@@@@@   @@@@@@@@@@@@@@@@/  &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@         ";
String L18S = "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  /@@@@@@@@@@@@@@@@@  *@@@@@@@/     @@@@@@@@  (@@@@@@@@@@@@@@@@@  (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(        ";
String L19S = "         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@  /@@@@@@@@@@@@@@@@@  *@@@@@@@/     @@@@@@@@  (@@@@@@@@@@@@@@@@@  (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@(        ";
String L20S = "        (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@@@%  &@@@@@@@@%../@@@@@@@@@  .@@@@@@@@@@@@@@@@#  &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@        ";
String L21S = "        @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@/  #@@@@@@@@@@@@@@@@@@@@@@@   @@@@@@@@@@@@@@/  #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/       ";
String L22S = "       .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@%   *@@@@@@@@&   .@@@@@@@@@@@@@@@@@@@@@@@@@@%   /@@@@@@@@%   .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&       ";
String L23S = "       #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/.%@@&          *@@@,                         %@@%          /@@@,.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@       ";
String L24S = "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@      ./@@@@@@@@%,                                .(@@@@@@@@%,      (@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@,      ";
String L25S = "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                                                                     #@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@/      ";
String L26S = "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@                                                                        &@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#      ";
String L27S = "      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.                                                                         @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&      ";
String L28S = "      .@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@*                                                                           @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@&      ";
String L29S = "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@@(                                                                             @@@@@@@@@@@@@@@@@@@@@@@@@@@@@#      ";
String L30S = "       @@@@@@@@@@@@@@@@@@@@@@@@@@@@%                                                                              .@@@@@@@@@@@@@@@@@@@@@@@@@@@@*      ";
String L31S = "       #@@@@@@@@@@@@@@@@@@@@@@@@@@%                                                                                .@@@@@@@@@@@@@@@@@@@@@@@@@@@.      ";
String L32S = "        @@@@@@@@@@@@@@@@@@@@@@@@@&                                                                                  ,@@@@@@@@@@@@@@@@@@@@@@@@@(       ";
String L33S = "         &@@@@@@@@@@@@@@@@@@@@@@.                                                                                     @@@@@@@@@@@@@@@@@@@@@@@         ";
String L34S = "           *@@@@@@@@@@@@@@@@@@                                                                                          /@@@@@@@@@@@@@@@@@&           ";
String L35S = "               ,#@@@@@@@&(.                                                                                                 *%@@@@@@@&/               ";

//Convert string art/line to array
String[] L1 = L1S.split("");
String[] L2 = L2S.split("");
String[] L3 = L3S.split("");
String[] L4 = L4S.split("");
String[] L5 = L5S.split("");
String[] L6 = L6S.split("");
String[] L7 = L7S.split("");
String[] L8 = L8S.split("");
String[] L9 = L9S.split("");
String[] L10 = L10S.split("");
String[] L11 = L11S.split("");
String[] L12 = L12S.split("");
String[] L13 = L13S.split("");
String[] L14 = L14S.split("");
String[] L15 = L15S.split("");
String[] L16 = L16S.split("");
String[] L17 = L17S.split("");
String[] L18 = L18S.split("");
String[] L19 = L19S.split("");
String[] L20 = L20S.split("");
String[] L21 = L21S.split("");
String[] L22 = L22S.split("");
String[] L23 = L23S.split("");
String[] L24 = L24S.split("");
String[] L25 = L25S.split("");
String[] L26 = L26S.split("");
String[] L27 = L27S.split("");
String[] L28 = L28S.split("");
String[] L29 = L29S.split("");
String[] L30 = L30S.split("");
String[] L31 = L31S.split("");
String[] L32 = L32S.split("");
String[] L33 = L33S.split("");
String[] L34 = L34S.split("");
String[] L35 = L35S.split("");


//Easter Egg DS4 Controller Start
System.out.println("><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><Playstation 4 Art><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><");
FN();

//Prints arrays using Displayer Algorithm
PrintArr2(L1);
PrintArr2(L2);
PrintArr2(L3);
PrintArr2(L4);
PrintArr2(L5);
PrintArr2(L6);
PrintArr2(L7);
PrintArr2(L8);
PrintArr2(L9);
PrintArr2(L10);
PrintArr2(L11);
PrintArr2(L12);
PrintArr2(L13);
PrintArr2(L14);
PrintArr2(L15);
PrintArr2(L16);
PrintArr2(L17);
PrintArr2(L18);
PrintArr2(L19);
PrintArr2(L20);
PrintArr2(L21);
PrintArr2(L22);
PrintArr2(L23);
PrintArr2(L24);
PrintArr2(L25);
PrintArr2(L26);
PrintArr2(L27);
PrintArr2(L28);
PrintArr2(L29);
PrintArr2(L30);
PrintArr2(L31);
PrintArr2(L32);
PrintArr2(L33);
PrintArr2(L34);
PrintArr2(L35);


  TN();
  TimeUnit.MILLISECONDS.sleep(90);
  System.out.println("You may now play on Playstation 4.");
  TN();
  
  
}

//System Exit
public static void SE(){
    Scanner S = new Scanner(System.in);
    
    System.out.println("Press Any Key to exit program.");
    S.nextLine();
    
    System.exit(0);
}

public static void main(String[] args) throws InterruptedException{
    Scanner S = new Scanner(System.in);
    boolean c=true;
    
//Credentials
  
  //Version Number
  String VN = "1.0";
  
  //App Name
  String AN = "\"Art Displayer\"";
  
  //Algorithm
  String Algo = "Art Display Algorithm was Designed by MINEJHAZZ(Aka. Jhazzmear John B. Saytas) \n" +
                "https://github.com/MINEJHAZZ";
  
//Welcome Message 
System.out.println("Welcome to "+ AN + "\nCurrent Version: \nVersion " + VN);
TN();
System.out.println(Algo);
FN();
  

  System.out.print("Press Any Key to display the Art.");
  S.nextLine();
  TN();
  
  
    while(c){
        String CS;
        
        DS4();
        TN();
        System.out.print("Type \"Done/D\" to exit the program \n"
                + "or\n"
                + "Press \"Any Key\" to print the Art Again.");
        CS = S.nextLine();
        FN();
        
        if (CS.equalsIgnoreCase("Done")||CS.equalsIgnoreCase("D")){
            c = false;
        }
    }
}
}

