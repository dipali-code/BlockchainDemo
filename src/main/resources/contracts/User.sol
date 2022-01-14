//SPDX-License-Identifier: Unlicensed
pragma solidity ^0.7.1;

contract User{

    string public name;
    uint public age;

    event UserEvent(
        string name,
        uint age
    );

    function set(string memory  _name,uint _age)public{
        age=_age;
        name=_name;
        emit UserEvent( _name, _age);

    }

    function get() public view returns(string memory ,uint){
        return (name, age);
    }


}