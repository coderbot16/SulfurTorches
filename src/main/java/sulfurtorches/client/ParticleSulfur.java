package sulfurtorches.client;

import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleEndRod;
import net.minecraft.world.World;

public class ParticleSulfur extends ParticleEndRod {
	protected ParticleSulfur(World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn) {
		super(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);

		this.setParticleTextureIndex(6);
		this.setColorFade((0x99 << 16) + (0xFF << 8) + (0xFF));

		this.particleRed = 0.25F;
		this.particleBlue = 1.0F;
		this.particleGreen = 1.0F;
	}

	public void onUpdate() {
		super.onUpdate();
		this.setParticleTextureIndex(6);
	}

	public static class Factory implements IParticleFactory {
		public Particle createParticle(int particleID, World worldIn, double xCoordIn, double yCoordIn, double zCoordIn, double xSpeedIn, double ySpeedIn, double zSpeedIn, int... extra)
		{
			return new ParticleSulfur(worldIn, xCoordIn, yCoordIn, zCoordIn, xSpeedIn, ySpeedIn, zSpeedIn);
		}
	}
}
