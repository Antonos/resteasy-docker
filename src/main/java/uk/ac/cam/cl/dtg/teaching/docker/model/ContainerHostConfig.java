package uk.ac.cam.cl.dtg.teaching.docker.model;

import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ContainerHostConfig {

	/**
	 * A list of volume bindings for this container. Each volume binding is a string in one of these forms:
	 *
	 * container_path to create a new volume for the container
     * host_path:container_path to bind-mount a host path into the container
     * host_path:container_path:ro to make the bind-mount read-only inside the container.
	 */
	@JsonProperty("Binds")
	private List<String> binds;
	
	/**
	 * A list of links for the container. Each link entry should be in the form of container_name:alias
	 */
	@JsonProperty("Links")
	private List<String> links;

	/**
	 * LXC specific configurations. These configurations only work when using the lxc execution driver.
	 */
	@JsonProperty("LxcConf")
	private String[] lxcConf;
	
	/**
	 * Memory limit in bytes.
	 */
	@JsonProperty("Memory")
	private Integer memory;
	
	/**
	 * Total memory limit (memory + swap); set -1 to disable swap You must use
	 * this with memory and make the swap value larger than memory.
	 */
	@JsonProperty("MemorySwap")
	private Integer memorySwap;

	/**
	 * Memory soft limit in bytes.
	 */
	@JsonProperty("MemoryReservation")
	private Integer memoryReservation;

	/**
	 * Kernel memory limit in bytes.
	 */
	@JsonProperty("KernelMemory")
	private Integer kernelMemory;
	
	/**
	 * An integer value containing the container’s CPU Shares (ie. the relative weight vs other containers).
	 */
	@JsonProperty("CpuShares")
	private Integer cpuShares;
	
	/**
	 * The length of a CPU period in microseconds.
	 */
	@JsonProperty("CpuPeriod")
	private Integer cpuPeriod;
	
	/**
	 * Microseconds of CPU time that the container can get in a CPU period.
	 */
	@JsonProperty("CpuQuota")
	private Integer cpuQuota;
	
	/**
	 * String value containing the cgroups CpusetCpus to use.
	 */
	@JsonProperty("CpusetCpus")
	private String cpusetCpus;

	/**
	 * Memory nodes (MEMs) in which to allow execution (0-3, 0,1). Only effective on NUMA systems.
	 */
	@JsonProperty("CpusetMems")
	private String cpusetMems;

	/**
	 *  Block IO weight (relative weight) accepts a weight value between 10 and 1000.
	 */
	@JsonProperty("BlkioWeight")
	private Integer blkioWeight;

	/**
	 *  Block IO weight (relative device weight) in the form of: "BlkioWeightDevice": [{"Path": "device_path", "Weight": weight}]
	 */
	@JsonProperty("BlkioWeightDevice")
	private List<String> blkioWeightDevice;

	/**
	 *  Limit read rate (bytes per second) from a device in the form of: "BlkioDeviceReadBps": [{"Path": "device_path", "Rate": rate}], for example: "BlkioDeviceReadBps": [{"Path": "/dev/sda", "Rate": "1024"}]"
	 */
	@JsonProperty("BlkioDeviceReadBps")
	private List<String> blkioDeviceReadBps;

	/**
	 *  Limit write rate (bytes per second) to a device in the form of: "BlkioDeviceWriteBps": [{"Path": "device_path", "Rate": rate}], for example: "BlkioDeviceWriteBps": [{"Path": "/dev/sda", "Rate": "1024"}]"
	 */
	@JsonProperty("BlkioDeviceWriteBps")
	private List<String> blkioDeviceWriteBps;

	/**
	 *  Limit read rate (IO per second) from a device in the form of: "BlkioDeviceReadIOps": [{"Path": "device_path", "Rate": rate}], for example: "BlkioDeviceReadIOps": [{"Path": "/dev/sda", "Rate": "1000"}]
	 */
	@JsonProperty("BlkioDeviceReadIOps")
	private List<String> blkioDeviceReadIOps;

	/**
	 *  Limit write rate (IO per second) to a device in the form of: "BlkioDeviceWriteIOps": [{"Path": "device_path", "Rate": rate}], for example: "BlkioDeviceWriteIOps": [{"Path": "/dev/sda", "Rate": "1000"}]
	 */
	@JsonProperty("BlkioDeviceWriteIOps")
	private List<String> blkioDeviceWriteIOps;

	/**
	 * Tune a container’s memory swappiness behavior. Accepts an integer between 0 and 100.
	 */
	@JsonProperty("MemorySwappiness")
	private Integer memorySwappiness;

	/**
	 *  Boolean value, whether to disable OOM Killer for the container or not.
	 */
	@JsonProperty("OomKillDisable")
	private Boolean oomKillDisable;

	/**
	 *  An integer value containing the score given to the container in order to tune OOM killer preferences
	 */
	@JsonProperty("OomScoreAdj")
	private Integer oomScoreAdj;

	/**
	 * A map of exposed container ports and the host port they should map to. 
	 */
	@JsonProperty("PortBindings")
	private Map<String,PortBinding> portBindings;

	/**
	 * Allocates a random host port for all of a container’s exposed ports. Specified as a boolean value.
	 */
	@JsonProperty("PublishAllPorts")
	private Boolean publishAllPorts;

	/**
	 * Gives the container full access to the host. Specified as a boolean value.
	 */
	@JsonProperty("Privileged")
	private Boolean privileged;

	/**
	 * Mount the container’s root filesystem as read only. Specified as a boolean value.
	 */
	@JsonProperty("ReadonlyRootfs")
	private Boolean readonlyRootfs;

	/**
	 * A list of DNS servers for the container to use.
	 */
	@JsonProperty("Dns")
	private List<String> dns;

	/**
	 * A list of DNS options
	 */
	@JsonProperty("DnsOptions")
	private List<String> dnsOptions;

	/**
	 * A list of DNS search domains
	 */
	@JsonProperty("DnsSearch")
	private List<String> dnsSearch;
	
	/**
	 *  A list of hostnames/IP mappings to add to the container’s /etc/hosts file. Specified in the form ["hostname:IP"].
	 */
	@JsonProperty("ExtraHosts")
	private String extraHosts;

	/**
	 * A list of volumes to inherit from another container. Specified in the form <container name>[:<ro|rw>]
	 */
	@JsonProperty("VolumesFrom")
	private List<String> volumesFrom;
	
	/**
	 * A list of kernel capabilities to add to the container.
	 */
	@JsonProperty("CapAdd")
	private String capAdd;
	
	/**
	 * A list of kernel capabilities to drop from the container.
	 */
	@JsonProperty("CapDrop")
	private String capDrop;

	/**
	 * The behavior to apply when the container exits. The value is an object
	 * with a Name property of either "always" to always restart,
	 * "unless-stopped" to restart always except when user has manually stopped
	 * the container or "on-failure" to restart only when the container exit
	 * code is non-zero. If on-failure is used, MaximumRetryCount controls the
	 * number of times to retry before giving up. The default is not to restart.
	 * (optional) An ever increasing delay (double the previous delay, starting
	 * at 100mS) is added before each restart to prevent flooding the server
	 */
	@JsonProperty("RestartPolicy")
	private RestartPolicy restartPolicy;

	/**
	 * Sets the networking mode for the container. Supported values are: bridge, host, and container:<name|id>
	 */
	@JsonProperty("NetworkMode")
	private String networkMode;

	/**
	 * A list of devices to add to the container specified as a JSON object in
	 * the form { "PathOnHost": "/dev/deviceName", "PathInContainer":
	 * "/dev/deviceName", "CgroupPermissions": "mrw"}
	 */
	@JsonProperty("Devices")
	private List<String> devices;

	/**
	 *  A list of ulimits to set in the container
	 */
	@JsonProperty("Ulimits")
	private List<Ulimit> ulimits;
	
	/**
	 * Log configuration for the container, 
	 */
	@JsonProperty("LogConfig")
	private LogConfig logConfig;
	
	/**
	 * A list of string values to customize labels for MLS systems, such as SELinux.
	 */
	@JsonProperty("SecurityOpt")
	private List<String> securityOpt;
	
	/**
	 * Path to cgroups under which the container’s cgroup is created. If the
	 * path is not absolute, the path is considered to be relative to the
	 * cgroups path of the init process. Cgroups are created if they do not
	 * already exist.
	 */
	@JsonProperty("CgroupParent")
	private String cgroupParent;
	
	/**
	 * Driver that this container users to mount volumes.
	 */
	@JsonProperty("VolumeDriver")
	private String volumeDriver;

	/**
	 * Size of /dev/shm in bytes. The size must be greater than 0. If omitted the system uses 64MB.
	 */
	@JsonProperty("ShmSize")
	private Integer shmSize;

	@JsonProperty("Isolation")
	private String isolation;
	
	@JsonProperty("ContainerIDFile")
	private String containerIDFile;
	
	@JsonProperty("IpcMode")
	private String ipcMode;

	@JsonProperty("PidMode")
	private String pidMode;

	@JsonProperty("PidsLimit")
	private Integer pidsLimit;

	@JsonProperty("UTSMode")
	private String utsMode;

	@JsonProperty("GroupAdd")
	private String groupAdd;
	
	@JsonProperty("ConsoleSize")
	private List<String> consoleSize;
	

	public List<String> getConsoleSize() {
		return consoleSize;
	}

	public void setConsoleSize(List<String> consoleSize) {
		this.consoleSize = consoleSize;
	}

	public String getGroupAdd() {
		return groupAdd;
	}

	public void setGroupAdd(String groupAdd) {
		this.groupAdd = groupAdd;
	}

	public String getUtsMode() {
		return utsMode;
	}

	public void setUtsMode(String utsMode) {
		this.utsMode = utsMode;
	}

	public String getPidMode() {
		return pidMode;
	}

	public void setPidMode(String pidMode) {
		this.pidMode = pidMode;
	}

	public Integer getPidsLimit() {
		return pidsLimit;
	}

	public void setPidsLimit(Integer pidsLimit) {
		this.pidsLimit = pidsLimit;
	}

	public String getIpcMode() {
		return ipcMode;
	}

	public void setIpcMode(String ipcMode) {
		this.ipcMode = ipcMode;
	}

	public String getContainerIDFile() {
		return containerIDFile;
	}

	public void setContainerIDFile(String containerIDFile) {
		this.containerIDFile = containerIDFile;
	}

	public List<String> getBinds() {
		return binds;
	}

	public void setBinds(List<String> binds) {
		this.binds = binds;
	}

	public List<String> getLinks() {
		return links;
	}

	public void setLinks(List<String> links) {
		this.links = links;
	}

	public String[] getLxcConf() {
		return lxcConf;
	}

	public void setLxcConf(String[] lxcConf) {
		this.lxcConf = lxcConf;
	}

	public Integer getMemory() {
		return memory;
	}

	public void setMemory(Integer memory) {
		this.memory = memory;
	}

	public Integer getMemorySwap() {
		return memorySwap;
	}

	public void setMemorySwap(Integer memorySwap) {
		this.memorySwap = memorySwap;
	}

	public Integer getMemoryReservation() {
		return memoryReservation;
	}

	public void setMemoryReservation(Integer memoryReservation) {
		this.memoryReservation = memoryReservation;
	}

	public Integer getKernelMemory() {
		return kernelMemory;
	}

	public void setKernelMemory(Integer kernelMemory) {
		this.kernelMemory = kernelMemory;
	}

	public Integer getCpuShares() {
		return cpuShares;
	}

	public void setCpuShares(Integer cpuShares) {
		this.cpuShares = cpuShares;
	}

	public Integer getCpuPeriod() {
		return cpuPeriod;
	}

	public void setCpuPeriod(Integer cpuPeriod) {
		this.cpuPeriod = cpuPeriod;
	}

	public Integer getCpuQuota() {
		return cpuQuota;
	}

	public void setCpuQuota(Integer cpuQuota) {
		this.cpuQuota = cpuQuota;
	}

	public String getCpusetCpus() {
		return cpusetCpus;
	}

	public void setCpusetCpus(String cpusetCpus) {
		this.cpusetCpus = cpusetCpus;
	}

	public String getCpusetMems() {
		return cpusetMems;
	}

	public void setCpusetMems(String cpusetMems) {
		this.cpusetMems = cpusetMems;
	}

	public Integer getBlkioWeight() {
		return blkioWeight;
	}

	public void setBlkioWeight(Integer blkioWeight) {
		this.blkioWeight = blkioWeight;
	}

	public List<String> getBlkioWeightDevice() {
		return blkioWeightDevice;
	}

	public void setBlkioWeightDevice(List<String> blkioWeightDevice) {
		this.blkioWeightDevice = blkioWeightDevice;
	}

	public List<String> getBlkioDeviceReadBps() {
		return blkioDeviceReadBps;
	}

	public void setBlkioDeviceReadBps(List<String> blkioDeviceReadBps) {
		this.blkioDeviceReadBps = blkioDeviceReadBps;
	}

	public List<String> getBlkioDeviceWriteBps() {
		return blkioDeviceWriteBps;
	}

	public void setBlkioDeviceWriteBps(List<String> blkioDeviceWriteBps) {
		this.blkioDeviceWriteBps = blkioDeviceWriteBps;
	}

	public List<String> getBlkioDeviceReadIOps() {
		return blkioDeviceReadIOps;
	}

	public void setBlkioDeviceReadIOps(List<String> blkioDeviceReadIOps) {
		this.blkioDeviceReadIOps = blkioDeviceReadIOps;
	}

	public List<String> getBlkioDeviceWriteIOps() {
		return blkioDeviceWriteIOps;
	}

	public void setBlkioDeviceWriteIOps(List<String> blkioDeviceWriteIOps) {
		this.blkioDeviceWriteIOps = blkioDeviceWriteIOps;
	}

	public Integer getMemorySwappiness() {
		return memorySwappiness;
	}

	public void setMemorySwappiness(Integer memorySwappiness) {
		this.memorySwappiness = memorySwappiness;
	}

	public Boolean getOomKillDisable() {
		return oomKillDisable;
	}

	public void setOomKillDisable(Boolean oomKillDisable) {
		this.oomKillDisable = oomKillDisable;
	}

	public Integer getOomScoreAdj() {
		return oomScoreAdj;
	}

	public void setOomScoreAdj(Integer oomScoreAdj) {
		this.oomScoreAdj = oomScoreAdj;
	}

	public Map<String, PortBinding> getPortBindings() {
		return portBindings;
	}

	public void setPortBindings(Map<String, PortBinding> portBindings) {
		this.portBindings = portBindings;
	}

	public Boolean getPublishAllPorts() {
		return publishAllPorts;
	}

	public void setPublishAllPorts(Boolean publishAllPorts) {
		this.publishAllPorts = publishAllPorts;
	}

	public Boolean getPrivileged() {
		return privileged;
	}

	public void setPrivileged(Boolean privileged) {
		this.privileged = privileged;
	}

	public Boolean getReadonlyRootfs() {
		return readonlyRootfs;
	}

	public void setReadonlyRootfs(Boolean readonlyRootfs) {
		this.readonlyRootfs = readonlyRootfs;
	}

	public List<String> getDns() {
		return dns;
	}

	public void setDns(List<String> dns) {
		this.dns = dns;
	}

	public List<String> getDnsOptions() {
		return dnsOptions;
	}

	public void setDnsOptions(List<String> dnsOptions) {
		this.dnsOptions = dnsOptions;
	}

	public List<String> getDnsSearch() {
		return dnsSearch;
	}

	public void setDnsSearch(List<String> dnsSearch) {
		this.dnsSearch = dnsSearch;
	}

	public String getExtraHosts() {
		return extraHosts;
	}

	public void setExtraHosts(String extraHosts) {
		this.extraHosts = extraHosts;
	}

	public List<String> getVolumesFrom() {
		return volumesFrom;
	}

	public void setVolumesFrom(List<String> volumesFrom) {
		this.volumesFrom = volumesFrom;
	}

	public String getCapAdd() {
		return capAdd;
	}

	public void setCapAdd(String capAdd) {
		this.capAdd = capAdd;
	}

	public String getCapDrop() {
		return capDrop;
	}

	public void setCapDrop(String capDrop) {
		this.capDrop = capDrop;
	}

	public RestartPolicy getRestartPolicy() {
		return restartPolicy;
	}

	public void setRestartPolicy(RestartPolicy restartPolicy) {
		this.restartPolicy = restartPolicy;
	}

	public String getNetworkMode() {
		return networkMode;
	}

	public void setNetworkMode(String networkMode) {
		this.networkMode = networkMode;
	}

	public List<String> getDevices() {
		return devices;
	}

	public void setDevices(List<String> devices) {
		this.devices = devices;
	}

	public List<Ulimit> getUlimits() {
		return ulimits;
	}

	public void setUlimits(List<Ulimit> ulimits) {
		this.ulimits = ulimits;
	}

	public LogConfig getLogConfig() {
		return logConfig;
	}

	public void setLogConfig(LogConfig logConfig) {
		this.logConfig = logConfig;
	}

	public List<String> getSecurityOpt() {
		return securityOpt;
	}

	public void setSecurityOpt(List<String> securityOpt) {
		this.securityOpt = securityOpt;
	}

	public String getCgroupParent() {
		return cgroupParent;
	}

	public void setCgroupParent(String cgroupParent) {
		this.cgroupParent = cgroupParent;
	}

	public String getVolumeDriver() {
		return volumeDriver;
	}

	public void setVolumeDriver(String volumeDriver) {
		this.volumeDriver = volumeDriver;
	}

	public Integer getShmSize() {
		return shmSize;
	}

	public void setShmSize(Integer shmSize) {
		this.shmSize = shmSize;
	}

	public String getIsolation() {
		return isolation;
	}

	public void setIsolation(String isolation) {
		this.isolation = isolation;
	}
}