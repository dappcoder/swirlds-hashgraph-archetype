#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
import com.swirlds.platform.*;

import java.io.IOException;
import java.time.Instant;

public class ${appName}State implements SwirldState {

    @Override
    public void init(Platform platform, AddressBook addressBook) {

    }

    @Override
    public AddressBook getAddressBookCopy() {
        return null;
    }

    @Override
    public void copyFrom(SwirldState swirldState) {

    }

    @Override
    public void handleTransaction(long l, boolean b, Instant instant, byte[] bytes, Address address) {

    }

    @Override
    public void noMoreTransactions() {

    }

    @Override
    public FastCopyable copy() {
        return new ${appName}State();
    }

    @Override
    public void copyTo(FCDataOutputStream fcDataOutputStream) throws IOException {

    }

    @Override
    public void copyFrom(FCDataInputStream fcDataInputStream) throws IOException {

    }
}
