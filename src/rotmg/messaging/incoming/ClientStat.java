package rotmg.messaging.incoming;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import flash.consumer.MessageConsumer;

public class ClientStat extends IncomingMessage {

    public String name;
    public int value;

    public ClientStat(int id, MessageConsumer callback) {
        super(id, callback);
    }

    @Override
    public void parseFromInput(DataInput in) throws IOException {
        this.name = in.readUTF();
        this.value = in.readInt();
    }

    @Override
    public void writeToOutput(DataOutput out) throws IOException {
        out.writeUTF(this.name);
        out.writeInt(this.value);
    }

}
