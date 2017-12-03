package me.yamas.core.objects;

import me.yamas.core.Main;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class Drzewkarka {
	
	public static void createRecipe(){
		ItemStack sg = new ItemStack(Material.BEDROCK, 1);;
	    ShapedRecipe stonegenerator = new ShapedRecipe(sg).shape(new String[] { 
	      "ABC", 
	      "DEF", 
	      "GHI" })
	      .setIngredient('A', Material.BEDROCK)
	      .setIngredient('B', Material.BEDROCK)
	      .setIngredient('C', Material.BEDROCK)
	      
	      .setIngredient('D', Material.BEDROCK)
	      .setIngredient('E', Material.STONE)
	      .setIngredient('F', Material.BEDROCK)
	      
	      .setIngredient('G', Material.BEDROCK)
	      .setIngredient('H', Material.BEDROCK)
	      .setIngredient('I', Material.BEDROCK);
	    Main.getInstance().getServer().addRecipe(stonegenerator); 
	}
}
