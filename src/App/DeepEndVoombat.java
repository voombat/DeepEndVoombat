package App;

import deependvoombat.obj.Flats;
import deependvoombat.obj.FlatsJpaController;
import deependvoombat.obj.HousesJpaController;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//We in Git Baby
public class DeepEndVoombat {

   
    public static void main(String[] args) {
        EntityManagerFactory objf = Persistence.createEntityManagerFactory("DeepEndVoombatPU");
        EntityManager em = objf.createEntityManager();
        FlatsJpaController flats = new FlatsJpaController(objf);
        HousesJpaController houses = new HousesJpaController(objf);
        System.out.println(flats.getFlatsCount());
        List<Flats> list_flats = flats.findFlatsEntities();
        for(int i=0;i<flats.getFlatsCount();i++){
        System.out.println(list_flats.get(i).getNumber());
        System.out.println(houses.findHouses(list_flats.get(i).getIdhouse()).getStreet());
        }
    
    }
    
}
