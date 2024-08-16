package fr.koi.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.sound.BlockSoundGroup;

public class MyFirstBlock extends Block {

    public MyFirstBlock() {
        super(AbstractBlock.Settings.create().sounds(BlockSoundGroup.GRASS));
    }

}
