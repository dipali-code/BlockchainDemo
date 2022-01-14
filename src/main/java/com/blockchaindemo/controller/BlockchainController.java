package com.blockchaindemo.controller;


import com.blockchaindemo.service.BlockchainService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/Blockchain")
public class BlockchainController {


    private final BlockchainService blockChainService;

    @GetMapping("/deployContract")
    @ApiOperation(value = "This API use to Deploy the Contract")
    public String deployContract() throws Exception {
        return blockChainService.deployContract();

    }

    @GetMapping("/loadContract/{contractAddress}")
    @ApiOperation(value = "This API use to load the Contract ")
    public String loadContract(@PathVariable String contractAddress) throws Exception {
        return blockChainService.loadContract(contractAddress);

    }

    @GetMapping("/subscriptionToEvent/{contractAddress}")
    @ApiOperation(value = "This API use to Subscribe the Event")
    public String subscriptionToEvent(@PathVariable String contractAddress) throws Exception {
         blockChainService.subscriptionToEvent(contractAddress);
         return "EVENT SUCCESSFULLY SUBSCRIBED";

    }
}
