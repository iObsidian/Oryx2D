package rotmg.messaging.incoming;

import alde.flash.utils.consumer.MessageConsumer;
import rotmg.messaging.data.WorldPosData;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

public class Goto extends IncomingMessage {

    public int objectId;
    public WorldPosData pos;

    public Goto(int id, MessageConsumer callback) {
        super(id, callback);
        this.pos = new WorldPosData();
    }

    @Override
    public void parseFromInput(DataInput in) throws IOException {
        this.objectId = in.readInt();
        this.pos.parseFromInput(in);
    }

    @Override
    public void writeToOutput(DataOutput out) throws IOException {
        out.writeInt(this.objectId);
        this.pos.writeToOutput(out);
    }

}
