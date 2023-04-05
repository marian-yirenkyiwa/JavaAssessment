package com.vmorg.buildrequest;

import com.vmorg.virtualmachineorganisation.Machine;

public interface VirtualMachineRequestor {
    void createNewRequest(Machine machine);
}
