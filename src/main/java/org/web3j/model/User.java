package org.web3j.model;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import org.web3j.abi.EventEncoder;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Event;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.abi.datatypes.generated.Uint256;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.DefaultBlockParameter;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.RemoteFunctionCall;
import org.web3j.protocol.core.methods.request.EthFilter;
import org.web3j.protocol.core.methods.response.BaseEventResponse;
import org.web3j.protocol.core.methods.response.Log;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tuples.generated.Tuple2;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.ContractGasProvider;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 4.8.7.
 */
@SuppressWarnings("rawtypes")
public class User extends Contract {
    public static final String BINARY = "608060405234801561001057600080fd5b506104e0806100206000396000f3fe608060405234801561001057600080fd5b506004361061004c5760003560e01c806306fdde0314610051578063262a9dff146100ce5780636d4ce63c146100e85780638a42ebe91461016f575b600080fd5b610059610219565b6040805160208082528351818301528351919283929083019185019080838360005b8381101561009357818101518382015260200161007b565b50505050905090810190601f1680156100c05780820380516001836020036101000a031916815260200191505b509250505060405180910390f35b6100d66102a7565b60408051918252519081900360200190f35b6100f06102ad565b6040518080602001838152602001828103825284818151815260200191508051906020019080838360005b8381101561013357818101518382015260200161011b565b50505050905090810190601f1680156101605780820380516001836020036101000a031916815260200191505b50935050505060405180910390f35b6102176004803603604081101561018557600080fd5b8101906020810181356401000000008111156101a057600080fd5b8201836020820111156101b257600080fd5b803590602001918460018302840111640100000000831117156101d457600080fd5b91908080601f0160208091040260200160405190810160405280939291908181526020018383808284376000920191909152509295505091359250610359915050565b005b6000805460408051602060026001851615610100026000190190941693909304601f8101849004840282018401909252818152929183018282801561029f5780601f106102745761010080835404028352916020019161029f565b820191906000526020600020905b81548152906001019060200180831161028257829003601f168201915b505050505081565b60015481565b6060600080600154818054600181600116156101000203166002900480601f01602080910402602001604051908101604052809291908181526020018280546001816001161561010002031660029004801561034a5780601f1061031f5761010080835404028352916020019161034a565b820191906000526020600020905b81548152906001019060200180831161032d57829003601f168201915b50505050509150915091509091565b60018190558151610371906000906020850190610417565b507ff4e43280a0d0dadc84edef1c7dd2e269b75d8abe3923c9d85cac8ecaae0fd97682826040518080602001838152602001828103825284818151815260200191508051906020019080838360005b838110156103d85781810151838201526020016103c0565b50505050905090810190601f1680156104055780820380516001836020036101000a031916815260200191505b50935050505060405180910390a15050565b828054600181600116156101000203166002900490600052602060002090601f016020900481019282601f1061045857805160ff1916838001178555610485565b82800160010185558215610485579182015b8281111561048557825182559160200191906001019061046a565b50610491929150610495565b5090565b5b80821115610491576000815560010161049656fea2646970667358221220da127c4d70ff444a7479486ab142b95fd9f779bc7e7bc13273d7fc1c3a4e6d4464736f6c63430007010033";

    public static final String FUNC_AGE = "age";

    public static final String FUNC_GET = "get";

    public static final String FUNC_NAME = "name";

    public static final String FUNC_SET = "set";

    public static final Event USEREVENT_EVENT = new Event("UserEvent", 
            Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
    ;

    @Deprecated
    protected User(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected User(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, credentials, contractGasProvider);
    }

    @Deprecated
    protected User(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected User(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        super(BINARY, contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public List<UserEventEventResponse> getUserEventEvents(TransactionReceipt transactionReceipt) {
        List<Contract.EventValuesWithLog> valueList = extractEventParametersWithLog(USEREVENT_EVENT, transactionReceipt);
        ArrayList<UserEventEventResponse> responses = new ArrayList<UserEventEventResponse>(valueList.size());
        for (Contract.EventValuesWithLog eventValues : valueList) {
            UserEventEventResponse typedResponse = new UserEventEventResponse();
            typedResponse.log = eventValues.getLog();
            typedResponse.name = (String) eventValues.getNonIndexedValues().get(0).getValue();
            typedResponse.age = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
            responses.add(typedResponse);
        }
        return responses;
    }

    public Flowable<UserEventEventResponse> userEventEventFlowable(EthFilter filter) {
        return web3j.ethLogFlowable(filter).map(new Function<Log, UserEventEventResponse>() {
            @Override
            public UserEventEventResponse apply(Log log) {
                Contract.EventValuesWithLog eventValues = extractEventParametersWithLog(USEREVENT_EVENT, log);
                UserEventEventResponse typedResponse = new UserEventEventResponse();
                typedResponse.log = log;
                typedResponse.name = (String) eventValues.getNonIndexedValues().get(0).getValue();
                typedResponse.age = (BigInteger) eventValues.getNonIndexedValues().get(1).getValue();
                return typedResponse;
            }
        });
    }

    public Flowable<UserEventEventResponse> userEventEventFlowable(DefaultBlockParameter startBlock, DefaultBlockParameter endBlock) {
        EthFilter filter = new EthFilter(startBlock, endBlock, getContractAddress());
        filter.addSingleTopic(EventEncoder.encode(USEREVENT_EVENT));
        return userEventEventFlowable(filter);
    }

    public RemoteFunctionCall<BigInteger> age() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_AGE, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Uint256>() {}));
        return executeRemoteCallSingleValueReturn(function, BigInteger.class);
    }

    public RemoteFunctionCall<Tuple2<String, BigInteger>> get() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_GET, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}, new TypeReference<Uint256>() {}));
        return new RemoteFunctionCall<Tuple2<String, BigInteger>>(function,
                new Callable<Tuple2<String, BigInteger>>() {
                    @Override
                    public Tuple2<String, BigInteger> call() throws Exception {
                        List<Type> results = executeCallMultipleValueReturn(function);
                        return new Tuple2<String, BigInteger>(
                                (String) results.get(0).getValue(), 
                                (BigInteger) results.get(1).getValue());
                    }
                });
    }

    public RemoteFunctionCall<String> name() {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(FUNC_NAME, 
                Arrays.<Type>asList(), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public RemoteFunctionCall<TransactionReceipt> set(String _name, BigInteger _age) {
        final org.web3j.abi.datatypes.Function function = new org.web3j.abi.datatypes.Function(
                FUNC_SET, 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(_name), 
                new org.web3j.abi.datatypes.generated.Uint256(_age)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    @Deprecated
    public static User load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new User(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    @Deprecated
    public static User load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new User(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public static User load(String contractAddress, Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return new User(contractAddress, web3j, credentials, contractGasProvider);
    }

    public static User load(String contractAddress, Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return new User(contractAddress, web3j, transactionManager, contractGasProvider);
    }

    public static RemoteCall<User> deploy(Web3j web3j, Credentials credentials, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(User.class, web3j, credentials, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<User> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(User.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<User> deploy(Web3j web3j, TransactionManager transactionManager, ContractGasProvider contractGasProvider) {
        return deployRemoteCall(User.class, web3j, transactionManager, contractGasProvider, BINARY, "");
    }

    @Deprecated
    public static RemoteCall<User> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(User.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static class UserEventEventResponse extends BaseEventResponse {
        public String name;

        public BigInteger age;
    }
}
