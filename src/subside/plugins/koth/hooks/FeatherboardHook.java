package subside.plugins.koth.hooks;

import java.util.logging.Level;

import org.bukkit.entity.Player;

import lombok.Getter;
import lombok.Setter;

public class FeatherboardHook extends AbstractRangeHook {
    private @Getter @Setter boolean enabled = false;
    private String board;
    
    /*
     * Changes by A248:
     * Disable this hook
     */
    
    public FeatherboardHook(HookManager hookManager) {
        super(hookManager, 
                hookManager.getPlugin().getConfigHandler().getHooks().getFeatherboard().getRange(), 
                hookManager.getPlugin().getConfigHandler().getHooks().getFeatherboard().getRangeMargin());
        
        getPlugin().getLogger().log(Level.INFO, "Featherboard hook: disabled (A248)");
        
    }

    @Override
    public void entersRange(Player player) {
        // Set board
        // To reduce randomly creating threads we check if it is the primary thread or otherwise create a sync thread
        /*if(Bukkit.isPrimaryThread()){
            be.maximvdw.featherboard.api.FeatherBoardAPI.showScoreboard(player, board);
        } else {
            Bukkit.getScheduler().runTaskLater(getPlugin(), () ->be.maximvdw.featherboard.api.FeatherBoardAPI.showScoreboard(player, board), 1);
        }*/
    	
    	/*
    	 * That's not how threads are created - A248
    	 */
    }

    @Override
    public void leavesRange(Player player) {
        // Reset board
        // To reduce randomly creating threads we check if it is the primary thread or otherwise create a sync thread
        /*if(Bukkit.isPrimaryThread()){
            be.maximvdw.featherboard.api.FeatherBoardAPI.removeScoreboardOverride(player, board);
            be.maximvdw.featherboard.api.FeatherBoardAPI.resetDefaultScoreboard(player);
        } else {
            Bukkit.getScheduler().runTaskLater(getPlugin(), () ->
                {
                    be.maximvdw.featherboard.api.FeatherBoardAPI.removeScoreboardOverride(player, board);
                    be.maximvdw.featherboard.api.FeatherBoardAPI.resetDefaultScoreboard(player);
                }, 1);
        }*/
    }
    
}
