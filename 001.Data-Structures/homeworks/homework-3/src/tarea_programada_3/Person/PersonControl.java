package tarea_programada_3.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import tarea_programada_3.AVLTree.AVLTree;
import tarea_programada_3.AVLTree.AVLTree.Node;
import java.util.Scanner;

public class PersonControl {

    List<Person> persons = new ArrayList<Person>();
    AVLTree personTree = new AVLTree();
    Node root = null;

    Scanner in = new Scanner(System.in);

    public void addPerson() {

        String name, lastName1, lastName2, id, birthDate, address, province, canton, district;
        System.out.println("Ingrese los datos de las persona que quiera guardar a continuacion:");
        System.out.println("Ingrese nombre de la persona");
        name = in.nextLine();
        System.out.println("Ingrese el primer apellido de la persona");
        lastName1 = in.nextLine();
        System.out.println("Ingrese el segundo apellido de la persona");
        lastName2 = in.nextLine();
        System.out.println("Ingrese la cedula de la persona");
        id = in.nextLine();
        System.out.println("Ingrese la fecha de nacimiento de la persona con el siguiente formato: 'dia/mes/año'");
        birthDate = in.nextLine();
        System.out.println("Ingrese la direccion de la persona");
        address = in.nextLine();
        System.out.println("Ingrese la provincia de la persona");
        province = in.nextLine();
        System.out.println("Ingrese el canton de la persona");
        canton = in.nextLine();
        System.out.println("Ingrese el distrito de la persona");
        district = in.nextLine();

        Person toTree = new Person(name, lastName1, lastName2, id, birthDate,
                address, province, canton, district);

        root = personTree.insert(root, toTree.year, toTree);

        persons.add(new Person(name, lastName1, lastName2, id, birthDate,
                address, province, canton, district));
    }

    public void deletePerson() {
        persons.remove(0);
    }

    public void deleteGraphPerson() {
        System.out.println("Igrese el año de la persona a ser eliminada:");
        String toDelete = in.nextLine();
        root = personTree.deleteNode(root, Integer.parseInt(toDelete));
    }

    public void printPersons() {
        Collections.sort(persons);
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i));
        }
    }

    public void printGraph() {
        personTree.print(root);
    }

    public void printPreOrder() {
        personTree.preOrder(root);
    }

    public void printInOrder() {
        personTree.inOrder(root);
    }

    public void printPostOrder() {
        personTree.postOrder(root);
    }

    public boolean isEmpty() {
        return persons.isEmpty();
    }
}
