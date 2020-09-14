// Made with Blockbench 3.6.6
// Exported for Minecraft version 1.14
// Paste this class into your mod and generate all required imports

public static class Modelvitabottle extends EntityModel {
	private final ModelRenderer bone;

	public Modelvitabottle() {
		textureWidth = 20;
		textureHeight = 20;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 12, 0, -1.0F, -12.0F, -1.0F, 2, 2, 2, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -10.0F, -2.0F, 4, 10, 4, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
	}
}