package subside.plugins.koth.hooks;

import java.util.logging.Level;

import org.bukkit.entity.Player;

import lombok.Getter;
import lombok.Setter;

public class EssentialsVanishHook extends AbstractHook {
    private @Getter @Setter boolean enabled = false;

    /*
     * Changes by A248:
     * Disable this hook
     */
    
    public EssentialsVanishHook(HookManager hookManager){
        super(hookManager); // First call the constructor of the parent class

        getPlugin().getLogger().log(Level.INFO, "Essentials Vanish hook: disabled (A248)");
    }

    @Override
    public boolean canCap(Player player) {
        return true;
    }

}
