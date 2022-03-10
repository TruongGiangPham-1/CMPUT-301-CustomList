import static org.junit.Assert.assertEquals;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        assertEquals(list.getCount(), listSize + 1);
    }
    @Test
    public void hasCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        boolean flag = list.hasCity(new City("Halifax", "NS"));
        assertEquals(true, flag);
    }

    @Test
    public void deleteCity(City city) {
        // delete halifax city that we added aboe
        City cityD = new City("Halifax", "NS");
        // make sure Halifax exist
        assertEquals(true, list.hasCity(cityD));
        list.deleteCity(cityD);
        assertEquals(false, list.hasCity(cityD));
    }
}
