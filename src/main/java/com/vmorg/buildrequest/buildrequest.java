package com.vmorg.buildrequest;

import com.vmorg.virtualmachineorganisation.Machine;

import java.util.HashMap;
import java.util.Map;

public interface buildrequest {
    void buildrequests(Machine machine);

    Map<String, Map<String, Integer>> totalBuildsByUserForDay();
}
