package rap.gangsta.general.ifaces.mdm;

public interface MdmServiceManager {

    public MdmCreateService getCreateService();

    public MdmDeleteService getDeleteService();

    public MdmListService getListService();

    public MdmUpdateService getUpdateService();

    public MdmLoadService getLoadService();
}
