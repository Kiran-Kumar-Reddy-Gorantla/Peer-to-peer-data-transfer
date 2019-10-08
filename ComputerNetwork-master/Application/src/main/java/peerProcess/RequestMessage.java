package peerProcess;

class RequestMessage extends Message {

    int     PieceId;

    RequestMessage(){
        // initializing the value in the parent class
        super(eOperationType.OPERATION_REQUEST.GetVal());
        PieceId = -1;
        //setting the size of the BitFieldMessage
        SetMessageLength(MessageClassLen + Integer.BYTES);
    }
}
