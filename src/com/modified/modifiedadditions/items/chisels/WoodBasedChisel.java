// 
// Decompiled by Procyon v0.5.30
// 

package com.modified.modifiedadditions.items.chisels;

import com.chrismin13.additionsapi.items.CustomTool;
import com.chrismin13.additionsapi.recipes.RecipeIngredient;
import org.bukkit.Material;
import us.fihgu.toolbox.item.DamageableItem;
import com.modified.modifiedadditions.abilities.ChiselAbilities;
import com.modified.modifiedadditions.items.wood.WoodBasedItem;

public class WoodBasedChisel extends WoodBasedItem implements ChiselAbilities
{
    public WoodBasedChisel(final byte b, final String s, final String s2, final String s3) {
        super(DamageableItem.WOODEN_PICKAXE, b, s, s2, s3, "wooden_chisel");
        this.modifyCustomItem((CustomTool)this, new RecipeIngredient(Material.WOOD, b));
    }
}
