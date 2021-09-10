package tarea_programada_3.UserInterface;

import java.util.Scanner;
import tarea_programada_3.Person.PersonControl;

public class UserInterface {
    
    PersonControl person = new PersonControl();
    
    public void Start(){
        
        System.out.println("\nCual de las siguientes opciones quiere hacer:");
        System.out.println("1. Añadir una persona");
        System.out.println("2. Eliminar una persona");
        System.out.println("3. Listar todas las personas en la base de datos");
        System.out.println("4. Salir");
        
        Scanner in = new Scanner(System.in);
        
        switch (in.nextLine()) {
            case "1":
                person.addPerson();
                System.out.println("\nPersona añadida\n");
                Start();
                break;
            case "2":
                if (person.isEmpty()) {
                    System.out.println("\nNo hay personas para eliminar\n");
                    Start();
                    break;
                }else{
                    System.out.println("Ingrese 1 para eliminar una persona de la lista");
                    System.out.println("Ingrese 2 para eliminar una persona del grafo");
                    Scanner in2 = new Scanner(System.in);
                    if ("1".equals(in2.nextLine())){
                        person.deletePerson();
                        System.out.println("\nPersona de la lista eliminada\n");
                        Start();
                        break;
                    } else{
                        person.deleteGraphPerson();
                        System.out.println("\nPersona del grafo eliminada\n");
                        Start();
                        break;
                    } 
                }
                
                
            case "3":
                Scanner in3 = new Scanner(System.in);
                System.out.println("Ingrese 1 para mostrar el grafo de manera pre-orden");
                System.out.println("Ingrese 2 para mostrar el grafo de manera in-orden");
                System.out.println("Ingrese 3 para mostrar el grafo de manera post-orden");
                System.out.println("Ingrese 4 para mostrar el grafo");
                System.out.println("Ingrese 5 para mostrar todas las personas");
                
                switch (in3.nextLine()){
                    case "1":
                        person.printPreOrder();
                        Start();
                        break;
                    case "2":
                        person.printInOrder();
                        Start();
                        break;
                    case "3":
                        person.printPostOrder();
                        Start();
                        break;
                    case "4":
                        person.printGraph();
                        Start();
                        break;
                    case "5":
                        person.printPersons();
                        Start();
                        break;
                }
            case "4":
                System.out.println("\nGracias por usar el programa :)\n");
                break;
            default:
                System.out.println("\nUsted ingreso una opcion incorrecta, vuelva a intentar\n");
                Start();
                break;
        }
    }
}
