package logisticspipes.pipes.unrouted;

import java.io.IOException;

import logisticspipes.network.LPDataInputStream;
import logisticspipes.network.LPDataOutputStream;
import logisticspipes.pipes.basic.CoreUnroutedPipe;
import logisticspipes.renderer.LogisticsRenderPipe;
import logisticspipes.renderer.newpipe.IHighlightPlacementRenderer;
import logisticspipes.textures.Textures;
import logisticspipes.transport.PipeTransportLogistics;

import net.minecraft.item.Item;

import net.minecraft.util.EnumFacing;

public class PipeItemsBasicTransport extends CoreUnroutedPipe {

	public PipeItemsBasicTransport(Item item) {
		super(new PipeTransportLogistics(false), item);
	}

	@Override
	public void writeData(LPDataOutputStream data) throws IOException {}

	@Override
	public void readData(LPDataInputStream data) throws IOException {}

	@Override
	public int getIconIndex(EnumFacing direction) {
		return Textures.LOGISTICSPIPE_BASIC_TRANSPORT_TEXTURE.normal;
	}

	@Override
	public int getTextureIndex() {
		return Textures.LOGISTICSPIPE_BASIC_TRANSPORT_TEXTURE.newTexture;
	}

	@Override
	public IHighlightPlacementRenderer getHighlightRenderer() {
		return LogisticsRenderPipe.secondRenderer;
	}
}
