package com.gmail.nossr50.skills.swords;

import com.gmail.nossr50.config.AdvancedConfig;

public class Swords {
    public static int    bleedMaxTicks      = AdvancedConfig.getInstance().getBleedMaxTicks();
    public static int    bleedBaseTicks     = AdvancedConfig.getInstance().getBleedBaseTicks();

    public static boolean counterAttackRequiresBlock = AdvancedConfig.getInstance().getCounterRequiresBlock();
    public static double  counterAttackModifier      = AdvancedConfig.getInstance().getCounterModifier();

    public static double serratedStrikesModifier   = AdvancedConfig.getInstance().getSerratedStrikesModifier();
    public static int    serratedStrikesBleedTicks = AdvancedConfig.getInstance().getSerratedStrikesTicks();

    //3rd change of the change request - the modifier of the criticalhit is placed in this class, Swords. 
    public static double criticalHitPVPModifier   = AdvancedConfig.getInstance().getCriticalHitPVPModifier();
    public static double criticalHitPVEModifier   = AdvancedConfig.getInstance().getCriticalHitPVEModifier();
}
