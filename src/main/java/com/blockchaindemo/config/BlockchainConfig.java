package com.blockchaindemo.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.web3j.abi.EventEncoder;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameterName;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.http.HttpService;
import org.web3j.protocol.websocket.WebSocketService;
import org.web3j.tx.gas.StaticGasProvider;
import org.web3j.model.User;

import javax.annotation.PostConstruct;
import java.math.BigInteger;
import java.net.ConnectException;

@Configuration
public class BlockchainConfig {

    @Value("${chain.addresses.rpc}")
    private String rpcPortAddress;

    @Value("${chain.addresses.ws}")
    private String webSocketUrl;

    @Value("${chain.account.private-key}")
    private String privateKey;

    @Value("${chain.gas-price}")
    private long gasPrice;

    @Value("${chain.gas-limit}")
    private long gasLimit;

    @Bean
    public Web3j web3j() throws ConnectException {
        WebSocketService webSocketService=new WebSocketService(webSocketUrl,true);
        webSocketService.connect();
        return Web3j.build(webSocketService);
                //Web3j.build(new HttpService(rpcPortAddress));
    }



   /* @Bean
    public User loadContract(Web3j web3j) {
        try {
            return User.deploy( web3j, Credentials.create(privateKey),
                    new StaticGasProvider(BigInteger.valueOf(gasPrice), BigInteger.valueOf(gasLimit))).send();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }*/


   /* @PostConstruct
    @DependsOn(value = {"loadContract","web3j"})
    public void subscribeToEvent() throws ConnectException {
        
        // create filter for contract events
        Web3j web3j=this.web3j();
        EthFilter filter = new EthFilter(DefaultBlockParameterName.EARLIEST, DefaultBlockParameterName.LATEST, this.loadContract(web3j).getContractAddress());

        String encodedEventSignature = EventEncoder.encode(User.USEREVENT_EVENT);
        filter.addSingleTopic(encodedEventSignature);

        // subscribe to events

        web3j.ethLogFlowable(filter).subscribe(event -> {
            System.out.println("Event received"+event);
            //log.info("event={}",event);
        }, error -> {
            System.out.println("Error: " + error);
        });

    }*/

}
