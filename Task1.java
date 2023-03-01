import java.util.*;

/*Реализуйте структуру телефонной книги с помощью HashMap, 
учитывая, что один человек может иметь несколько телефонов. */
public class Task1 {
    public static void main(String[] args) {
        Map<String, List<Integer>> phoneBook = new HashMap();
        List<Integer> phones = new ArrayList<>(List.of(1111,22222));
           
        //Добавляем списком только телефоны для ключа-фамилии
        phoneBook.put("Lebedev", phones);
        phoneBook.put("Petrov", new ArrayList<>(List.of(5555)));

        System.out.println(phoneBook);
        System.out.println();
        
        //______________делаем хэшмэп в хэшмепе, значением выступает другой хэшмеп
        HashMap<String, HashMap<String, Integer>> fullPhoneBook = new HashMap<String, HashMap<String, Integer>>();
        HashMap<String, Integer> lebedevPhones = new HashMap<String, Integer>();

        lebedevPhones.put("Mobile", 895214744);
        lebedevPhones.put("home",7895263);
        fullPhoneBook.put("Lebedev", lebedevPhones);

        HashMap<String,Integer> kurochkinsPhones = new HashMap<>();//создали мэп для курочкина
        fullPhoneBook.put("Kurochkin", kurochkinsPhones); // вложили в справочник

        fullPhoneBook.get("Kurochkin").put("home", 8878844); // добавили курочкину телефон

        

        HashMap<String, Integer> ZaitcevPhones = new HashMap<String, Integer>();
        ZaitcevPhones.put("Mobile", 9985774);
        ZaitcevPhones.put("home",123554);
        fullPhoneBook.put("Zaitcev", ZaitcevPhones);
        System.out.println(fullPhoneBook);
        System.out.println();


        // создали отдельный класс и значением является список экземпляров этого класса (содержат тип телефона и номер)
        HashMap<String,List<PhoneWithLabel>> phonesTypesMap = new HashMap<>();

        
        
        List<PhoneWithLabel> VasilievsNumbers = new ArrayList<>();
        VasilievsNumbers.add(new PhoneWithLabel(785654, "homephone"));
        VasilievsNumbers.add(new PhoneWithLabel(877745, "worknumber"));

        phonesTypesMap.put("Petuhov", new ArrayList<>());
        phonesTypesMap.put("Vasiliev", VasilievsNumbers);

        System.out.println(new PhoneWithLabel(1111, "sdfsdfs"));


    }
}