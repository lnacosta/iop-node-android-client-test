package com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.clients.events;

import com.bitdubai.fermat_api.layer.all_definition.events.common.AbstractEvent;
import com.bitdubai.fermat_api.layer.all_definition.network_service.enums.NetworkServiceType;
import com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.data.client.respond.ACKRespond;
import com.bitdubai.fermat_p2p_api.layer.all_definition.communication.enums.P2pEventType;

/**
 * The class <code>com.bitdubai.fermat_p2p_api.layer.all_definition.communication.commons.clients.events.NetworkClientNewMessageTransmitEvent</code>
 * is the representation of a network client registered event <code>P2pEventType.NETWORK_CLIENT_NEW_MESSAGE_TRANSMIT</code>.
 * The event indicates that one message is received.
 * <p/>
 *
 * Created by Leon Acosta - (laion.cj91@gmail.com) on 17/05/2016.
 *
 * @author  lnacosta
 * @version 1.0
 * @since   Java JDK 1.7
 */
public class NetworkClientACKEvent extends AbstractEvent<P2pEventType> {

    /**
     * Represent the content value
     */
    private ACKRespond ackRespond;

    /**
     * Represent the networkServiceTypeSource value
     */
    private NetworkServiceType networkServiceTypeSource;

    /**
     * Constructor with parameters
     *
     * @param p2pEventType
     */
    public NetworkClientACKEvent(P2pEventType p2pEventType) {
        super(p2pEventType);
    }

    public ACKRespond getContent() {
        return ackRespond;
    }

    public void setContent(ACKRespond content) {
        this.ackRespond = content;
    }

    public NetworkServiceType getNetworkServiceTypeSource() {
        return networkServiceTypeSource;
    }

    public void setNetworkServiceTypeSource(NetworkServiceType networkServiceTypeSource) {
        this.networkServiceTypeSource = networkServiceTypeSource;
    }

    @Override
    public String toString() {
        return "NetworkClientNewMessageTransmitEvent{" +
                "content='" + ackRespond + '\'' +
                ", networkServiceTypeSource=" + networkServiceTypeSource +
                '}';
    }
}
