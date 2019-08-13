public class CleanCode {

//    if(deletePage(page) == E_OK){
//        if(registry.deleteReference(page.name) == E_OK) {
//            if(configKeys.deleteKey(page.name.makeKey()) == E_OK){
//                logger.log("page deleted");
//            }else {
//                logger.log("configKey not deleted");
//            }
//        }else {
//            logger.log("deleteRefernce from registry failed");
//        }
//    }else{
//        logger.log("delete failed");
//        return E_ERROR;
//    }
//    public void delete(Page page){
//        try {
//            deletePageAndAllReferences(page);
//        }catch (Exception e){
//            logError(e);
//        }
//    }
//
//    private void deletePageAndAllReferences(Page page) throws Exception {
//        deletePage(page);
//        registry.deleteReference(page.name);
//        configKeys.deleteKey(page.name.makeKey());
//    }
//    private void logError(Exception e){
//        logger.log(e.getMessage());
//    }
//
//    public static void main(String[] args) {
//    }
}
