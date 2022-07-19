package net.unethicallite.scripts.tbl.behaviour;

import net.runelite.api.DialogOption;
import net.runelite.api.NPC;
import net.unethicalite.api.entities.NPCs;
import net.unethicalite.api.widgets.Dialog;
import net.unethicallite.scripts.tbl.TreeBranchLeaf;
import net.unethicallite.scripts.tbl.framework.Leaf;

public class BuyWoadLeaf extends Leaf<TreeBranchLeaf>
{
    @Override
    public boolean isValid()
    {
        return true;
    }

    @Override
    public int onLoop()
    {
        Dialog.invokeDialog(
                DialogOption.NPC_CONTINUE,
                DialogOption.CHAT_OPTION_ONE,
                DialogOption.PLAYER_CONTINUE,
                DialogOption.NPC_CONTINUE,
                DialogOption.CHAT_OPTION_FOUR,
                DialogOption.PLAYER_CONTINUE,
                DialogOption.NPC_CONTINUE,
                DialogOption.NPC_CONTINUE,
                DialogOption.NPC_CONTINUE
        );
        NPC wyson = NPCs.getNearest("Wyson the gardener");
        if (wyson != null)
        {
            wyson.interact("Talk-to");
        }
        return 600;
    }
}
