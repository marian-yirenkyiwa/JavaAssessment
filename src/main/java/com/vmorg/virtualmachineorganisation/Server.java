package com.vmorg.virtualmachineorganisation;

public class Server extends Machine{
    private String linuxDistributionName;
    private int numberOfDistribution;
    private double kernelVersion;
    private String adminTeam;

    public Server(String hostname, String nameOfRequestor, int numberOfCpu, int numberOfRam, long hardDiskSize, double kernelVersion, String adminTeam){
        super(hostname, nameOfRequestor, numberOfCpu, numberOfRam, hardDiskSize);

        this.kernelVersion = kernelVersion;
        this.adminTeam = adminTeam;
    }
}

