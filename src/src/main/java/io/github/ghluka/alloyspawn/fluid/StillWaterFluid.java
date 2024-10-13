
package io.github.ghluka.alloyspawn.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import io.github.ghluka.alloyspawn.init.AlloyspawnModItems;
import io.github.ghluka.alloyspawn.init.AlloyspawnModFluids;
import io.github.ghluka.alloyspawn.init.AlloyspawnModFluidTypes;
import io.github.ghluka.alloyspawn.init.AlloyspawnModBlocks;

public abstract class StillWaterFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> AlloyspawnModFluidTypes.STILL_WATER_TYPE.get(), () -> AlloyspawnModFluids.STILL_WATER.get(), () -> AlloyspawnModFluids.FLOWING_STILL_WATER.get())
			.explosionResistance(100f).bucket(() -> AlloyspawnModItems.STILL_WATER_BUCKET.get()).block(() -> (LiquidBlock) AlloyspawnModBlocks.STILL_WATER.get());

	private StillWaterFluid() {
		super(PROPERTIES);
	}

	public static class Source extends StillWaterFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends StillWaterFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
