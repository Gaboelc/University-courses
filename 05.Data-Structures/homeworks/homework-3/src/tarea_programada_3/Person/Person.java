package tarea_programada_3.Person;

import java.util.ArrayList;
import java.util.List;

public class Person implements Comparable<Person> { 

    String name;
    String lastName1;
    String lastName2;
    String id;
    String birthDate;
    int day;
    int month;
    int year;
    String address;
    String province;
    String canton;
    String district;

    /**
     * @param name_arg
     * @param lastName1_arg
     * @param lastName2_arg
     * @param id_arg
     * @param birthDate_arg
     * @param address_arg
     * @param province_arg
     * @param canton_arg
     * @param district_arg
     */
    public Person(String name_arg, String lastName1_arg, String lastName2_arg,
            String id_arg, String birthDate_arg, String address_arg, String province_arg,
            String canton_arg, String district_arg) {

        this.name = name_arg;
        this.lastName1 = lastName1_arg;
        this.lastName2 = lastName2_arg;
        this.id = id_arg;
        this.birthDate = birthDate_arg;
        this.address = address_arg;
        this.province = province_arg;
        this.canton = canton_arg;
        this.district = district_arg;

        String[] parts = birthDate_arg.split("/");
        this.day = Integer.parseInt(parts[0]);
        this.month = Integer.parseInt(parts[1]);
        this.year = Integer.parseInt(parts[2]);

    }

    public String getName() {
        return name;
    }

    public String getLastName1() {
        return lastName1;
    }

    public String getLastName2() {
        return lastName2;
    }

    public String getId() {
        return id;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String getAddress() {
        return address;
    }

    public String getProvince() {
        return province;
    }

    public String getCanton() {
        return canton;
    }

    public String getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastName1=" + lastName1 + 
               ", lastName2=" + lastName2 + ", id=" + id + ", birthDate=" +
                birthDate + ", address=" + address + ", province=" + province +
                ", canton=" + canton + ", district=" + district + '}';
    }

    @Override
    public int compareTo(Person arg0) {
        int compare = Integer.compare(year, arg0.year);
        if (compare == 0) {
            compare = name.compareTo(arg0.name);
        }
        return compare;
    }
}
