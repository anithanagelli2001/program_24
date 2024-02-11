/*
 *
 * You can use the following import statements
 * 
 * import java.util.ArrayList;
 * 
 */

// Write your code here
package com.example.dinemaster.repository;

import com.example.dinemaster.model.*;

import java.util.ArrayList;

public interface ChefRepository {
    ArrayList<Chef> getChefs();

    Chef getChefById(int id);

    Chef addChef(Chef chef);

    Chef updateChef(int id, Chef chef);

    void deleteChef(int id);

    Restaurant getChefRestaurant(int id);
}
