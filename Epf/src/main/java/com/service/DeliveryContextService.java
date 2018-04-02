package com.service;

//@Service
//@Transactional
public class DeliveryContextService {
/*
    private final Logger log = LoggerFactory.getLogger(DeliveryContextService.class);

    private static final String DELIVERYCONTEXT_CACHE = "deliveryContext";
    
    private final DeliveryContextRepository deliveryContextRepository;
    
    private final PackageStructureRepository packageStructureRepository;
    
    private final DeliveryContextMaterialsRepository deliveryContextMaterialsRepository;
    
    private final MaterialVideoRequirementsRepository materialTechRequirementsRepository;
    
    private final MaterialImageRequirementsRepository materialImageRequirementsRepository;
    
//    private final MaterialPackagePathRepository materialPackagePathRepository;
//    
//    private final MaterialDeliveryPathRepository materialDeliveryPathRepository;
//    
//    private final FileNamePartRepository fileNamePartRepository;

    
    public DeliveryContextService(DeliveryContextRepository deliveryContextRepository,
            PackageStructureRepository packageStructureRepository,
            DeliveryContextMaterialsRepository deliveryContextMaterialsRepository,
            MaterialVideoRequirementsRepository materialTechRequirementsRepository,
            MaterialImageRequirementsRepository materialImageRequirementsRepository
//            MaterialPackagePathRepository materialPackagePathRepository,
//            MaterialDeliveryPathRepository materialDeliveryPathRepository,
//            FileNamePartRepository fileNamePartRepository) {
            ) {
        this.deliveryContextRepository = deliveryContextRepository;
        this.packageStructureRepository = packageStructureRepository;
        this.deliveryContextMaterialsRepository= deliveryContextMaterialsRepository;
        this.materialImageRequirementsRepository = materialImageRequirementsRepository;
        this.materialTechRequirementsRepository = materialTechRequirementsRepository;
//        this.materialPackagePathRepository = materialPackagePathRepository;
//        this.materialDeliveryPathRepository = materialDeliveryPathRepository;
//        this.fileNamePartRepository = fileNamePartRepository;
    }
    
    
    public List<DeliveryContextDTO> getEndpointChannelProfile(DeliveryContextRequestDTO queryDto) {
        List<DeliveryContextDTO> endpointProfileDTOs = null;
        List<DeliveryContext> deliveryContexts = findDeliveryContext(queryDto);
        
        if(!CollectionUtils.isEmpty(deliveryContexts)) {
            endpointProfileDTOs = new ArrayList<>();
            for (DeliveryContext deliveryContext : deliveryContexts) {
                DeliveryContextDTO endpointProfileDTO = new DeliveryContextDTO();
                endpointProfileDTO.setEntityType(deliveryContext.getEntityType().getName());
                endpointProfileDTO.setPlatform(deliveryContext.getPlatform().getName());
                endpointProfileDTO.setChannel(deliveryContext.getChannel().getName());
                endpointProfileDTO.setEndpoint(deliveryContext.getEndPoint().getName());
                
                includePackageStructures(deliveryContext, endpointProfileDTO);
                endpointProfileDTOs.add(endpointProfileDTO);
            } 
        };
//        if(CollectionUtils.isEmpty(endpointProfileDTOs)) throw new DeliveryContextNotFoundError();
        return endpointProfileDTOs;
    }


    private List<DeliveryContext> findDeliveryContext(DeliveryContextRequestDTO queryDto) {
        Endpoint endpoint = new Endpoint();
        endpoint.setName(queryDto.getEndpoint());
        if(endpoint.getName() == null) throw new BadRequestAlertException("endpoint is required field", "endpoint", "EPD_ERR_INVALID_REQUEST");
        Channel channel = new Channel();
        channel.setName(queryDto.getChannel());
        EntityType entityType = new EntityType();
        entityType.setName(queryDto.getEntityType());
        Platform platform = new Platform();
        platform.setName(queryDto.getPlatform());
        DeliveryContext deliveryContextRequest = new DeliveryContext();
        deliveryContextRequest.setEndPoint(endpoint);
        deliveryContextRequest.setChannel(channel);
        deliveryContextRequest.setPlatform(platform);
        deliveryContextRequest.setEntityType(entityType);
        
        List<DeliveryContext> deliveryContexts = deliveryContextRepository.findAll(Example.of(deliveryContextRequest));
        return deliveryContexts;
    }


    private void includePackageStructures(DeliveryContext deliveryContext, DeliveryContextDTO endpointProfileDTO) {
        PackageStructure packageStructure = new PackageStructure();
        packageStructure.setDeliveryContext(deliveryContext);
        List<PackageStructure> packageStructures = packageStructureRepository.findAll(Example.of(packageStructure));
        if(!CollectionUtils.isEmpty(packageStructures)) {
            List<PackageStructureDTO> pkgStructureDTOs = new ArrayList<>();
            for (PackageStructure pkgStructure : packageStructures) {
                PackageStructureDTO packageStructureDto = new PackageStructureDTO();
                packageStructureDto.setName(pkgStructure.getName());
                
                includeDeliveryContextMaterials(pkgStructure, packageStructureDto);
                pkgStructureDTOs.add(packageStructureDto);  
             }
            endpointProfileDTO.setPackageStructures(pkgStructureDTOs);
        }
    }


    private void includeDeliveryContextMaterials(PackageStructure pkgStructure,
            PackageStructureDTO packageStructureDto) {
        DeliveryContextMaterials deliveryContextMaterial = new DeliveryContextMaterials();
        deliveryContextMaterial.setPackageStructure(pkgStructure);
        List<DeliveryContextMaterials> deliveryContextMaterials = deliveryContextMaterialsRepository.findAll(Example.of(deliveryContextMaterial));
        if(!CollectionUtils.isEmpty(deliveryContextMaterials)) {
            List<MaterialDTO> materialDTOs = new ArrayList<>();
            List<DeliveryDTO> deliveryDTOs = new ArrayList<>();
            for (DeliveryContextMaterials deliveryCtxtMaterial : deliveryContextMaterials) {
                Material material = deliveryCtxtMaterial.getMaterial();
                MaterialDTO materialDTO = new MaterialDTO();
                DeliveryDTO deliveryDTO = new DeliveryDTO();
                materialDTO.setType(material.getMaterialType().getName());
                materialDTO.setContentLevel(material.getContentLevel().getName());
//                materialDTO.setChecksumRequired(deliveryCtxtMaterial.isChecksumRequired());
//                materialDTO.setTemplateName(material.getTemplate().getName());
                deliveryDTO.setType(material.getMaterialType().getName());
                deliveryDTO.setContentLevel(material.getContentLevel().getName());
                
                
//                if(deliveryCtxtMaterial.getDeliveryTemplate() != null) {
//                    deliveryDTO.setTemplateName(deliveryCtxtMaterial.getDeliveryTemplate().getName());
//                }
//                if(deliveryCtxtMaterial.getApprovalTemplate() != null) {
//                    deliveryDTO.setApprovalTemplate(deliveryCtxtMaterial.getApprovalTemplate().getName());
//                }
                if(deliveryCtxtMaterial.getDeliveryMethod() != null) {
                    deliveryDTO.setMethod(deliveryCtxtMaterial.getDeliveryMethod().getName());
                }
//                deliveryDTO.setOrderOfDelivery(deliveryCtxtMaterial.getOrderOfDelivery());
                materialDTOs.add(materialDTO);
                deliveryDTOs.add(deliveryDTO);
                //Material Tech Requirements
                includeMaterialTechRequirements(material, materialDTO);
                includeMaterialImageRequirements(material, materialDTO);
                //Material File Name
//                materialDTO.setDestinationTemplate(deliveryCtxtMaterial.getDeliveryTemplate().getName());
//                updateMaterialPackageLocation(deliveryCtxtMaterial, materialDTO);
//                updateMaterialDeliveryLocation(deliveryCtxtMaterial, deliveryDTO);
                
            }
            packageStructureDto.setMaterials(materialDTOs);
           // packageStructureDto.setDelivery(deliveryDTOs);
        }
    }
    
    private void updateMaterialDeliveryLocation(DeliveryContextMaterials deliveryCtxtMaterial, DeliveryDTO deliveryDTO) {
        MaterialDeliveryPath deliveryPath = new MaterialDeliveryPath();
        deliveryPath.setMaterial(deliveryCtxtMaterial);
        deliveryPath = materialDeliveryPathRepository.findOne(Example.of(deliveryPath));
        if(deliveryPath != null) {
            String fileName = resolveFileName(deliveryPath.getFileName());
            String filePath = resolveFileName(deliveryPath.getFilePath());
            String destFolder = resolveFileName(deliveryPath.getDestinationfolder());
            deliveryDTO.setFileName(fileName);
            deliveryDTO.setFileNameTemplate(deliveryPath.getFileName().getTemplate().getName());
            deliveryDTO.setFolderName(filePath);
            deliveryDTO.setFolderNameTemplate(deliveryPath.getFilePath().getTemplate().getName());
            deliveryDTO.setDestinationFolder(destFolder);
            deliveryDTO.setDestinationTemplate(deliveryPath.getDestinationfolder().getTemplate().getName());
        }
    }


    private void updateMaterialPackageLocation(DeliveryContextMaterials deliveryCtxtMaterial, MaterialDTO materialDTO) {
        MaterialPackagePath packagePath = new MaterialPackagePath();
        packagePath.setMaterial(deliveryCtxtMaterial);
        packagePath = materialPackagePathRepository.findOne(Example.of(packagePath));
        if(packagePath != null) {
            String fileName = resolveFileName(packagePath.getFileName());
            String filePath = resolveFileName(packagePath.getFilePath());
            String destFolder = resolveFileName(packagePath.getDestinationfolder());
            materialDTO.setFileName(fileName);
            materialDTO.setFileNameTemplate(packagePath.getFileName().getTemplate().getName());
            materialDTO.setFolderName(filePath);
            materialDTO.setFolderNameTemplate(packagePath.getFilePath().getTemplate().getName());
            materialDTO.setDestinationFolder(destFolder);
            materialDTO.setDestinationTemplate(packagePath.getDestinationfolder().getTemplate().getName());
        }
    }


    private String resolveFileName(FileName fileName) {
        final StringBuffer fileNameStr = new StringBuffer();
        FileNamePart fileNamePartReq = new FileNamePart();
        fileNamePartReq.setFileName(fileName);
        List<FileNamePart> fileNameParts = fileNamePartRepository.findAll(Example.of(fileNamePartReq));
        if(!CollectionUtils.isEmpty(fileNameParts)) {
            fileNameParts.stream()
                .filter(fileNamePart -> fileNamePart.getParent() == null)
                .findFirst()
                .ifPresent(fileNamePart -> {
                    buildFileName(fileNameStr, fileNamePart, fileNameParts);
                });
            
        }
        
        return fileNameStr.toString();
    }


    private void buildFileName(final StringBuffer fileNameStr, FileNamePart fileNamePart, List<FileNamePart> fileNameParts) {
        if(fileNamePart.getPrefix() != null)fileNameStr.append(fileNamePart.getPrefix());
        if(fileNamePart.getSubstitute() != null) {
            fileNameStr.append("$")
                        .append(fileNamePart.getSubstitute().getType().getName())
                        .append("{")
                        .append(fileNamePart.getSubstitute().getValue().getName())
                        .append("}");
        }
        if(fileNamePart.getSuffix() != null)fileNameStr.append(fileNamePart.getSuffix());
        
        fileNameParts.stream()
                    .filter(childFileNamePart -> {
                        return childFileNamePart.getParent() != null && 
                                childFileNamePart.getParent().getId() == fileNamePart.getId();
                    })
                    .findFirst()
                    .ifPresent(childFileNamePart -> {
                        buildFileName(fileNameStr, childFileNamePart, fileNameParts);
                    });
    }


    private void includeMaterialTechRequirements(Material material, MaterialDTO materialDTO) {
        MaterialVideoRequirements materialTechRequirements = new MaterialVideoRequirements();
        materialTechRequirements.setMaterial(material);
        List<MaterialVideoRequirements> techRequirements = materialTechRequirementsRepository.findAll(Example.of(materialTechRequirements));
        if(!CollectionUtils.isEmpty(techRequirements)) {
            List<TechnicalRequirementsDTO> technicalRequirementsDTOs = new ArrayList<>();
            for (MaterialVideoRequirements materialTechRequirement : techRequirements) {
                TechVideoRequirements techVideoRequirements = materialTechRequirement.getVideoRequirement();
                TechnicalRequirementsDTO technicalRequirementsDTO = new TechnicalRequirementsDTO();
                technicalRequirementsDTO.setAudioChannels(techVideoRequirements.getAudioChannelConfiguration());
                if(techVideoRequirements.getVideoCodec() != null) {
                    technicalRequirementsDTO.setCodec(techVideoRequirements.getVideoCodec().getName());
                }
                if(techVideoRequirements.getAudioCodec() != null) {
                    technicalRequirementsDTO.setAudioCodec(techVideoRequirements.getAudioCodec().getName());
                }
                technicalRequirementsDTO.setFrameRate(String.valueOf(techVideoRequirements.getFrameRate()));
                technicalRequirementsDTO.setCaptionEmbedded(techVideoRequirements.isCaptionEmbedded());
                if(techVideoRequirements.getDimension() != null) {
                    technicalRequirementsDTO.setWidth(techVideoRequirements.getDimension().getWidth());
                    technicalRequirementsDTO.setHeight(techVideoRequirements.getDimension().getHeight());
                }
                if(techVideoRequirements.getDisplayAspectRatio() != null) {
                    technicalRequirementsDTO.setDisplayAspectRatio(techVideoRequirements.getDisplayAspectRatio().getName());
                }
                if(techVideoRequirements.getStorageAspectRatio() != null) {
                    technicalRequirementsDTO.setStorageAspectRatio(techVideoRequirements.getStorageAspectRatio().getName());
                }
                if(techVideoRequirements.getEncodingFormat() != null) {
                    technicalRequirementsDTO.setEncodingFormat(techVideoRequirements.getEncodingFormat().getName());
                }
                if(techVideoRequirements.getVideoAvgBitRate() != null) {
                    technicalRequirementsDTO.setBitrate(String.valueOf(techVideoRequirements.getVideoAvgBitRate()));
                }
                if(techVideoRequirements.getScanType() != null) {
                    technicalRequirementsDTO.setScanType(techVideoRequirements.getScanType().getName());
                }
                
                technicalRequirementsDTOs.add(technicalRequirementsDTO);
            }
            materialDTO.setTechnicalRequirements(technicalRequirementsDTOs);
        }
    }
    
    private void includeMaterialImageRequirements(Material material, MaterialDTO materialDTO) {
        MaterialImageRequirements materialImageRequirements = new MaterialImageRequirements();
        materialImageRequirements.setMaterial(material);
        List<MaterialImageRequirements> imgRequirements = materialImageRequirementsRepository.findAll(Example.of(materialImageRequirements));
        if(!CollectionUtils.isEmpty(imgRequirements)) {
            List<TechnicalRequirementsDTO> technicalRequirementsDTOs = new ArrayList<>();
            for (MaterialImageRequirements materialTechRequirement : imgRequirements) {
//                StaticImageRequirements imageRequirements = materialTechRequirement.getImageRequirement();
                TechnicalRequirementsDTO technicalRequirementsDTO = new TechnicalRequirementsDTO();
//                technicalRequirementsDTO.setWidth(imageRequirements.getDimension().getWidth());
//                technicalRequirementsDTO.setHeight(imageRequirements.getDimension().getHeight());
                technicalRequirementsDTOs.add(technicalRequirementsDTO);
            }
            materialDTO.setTechnicalRequirements(technicalRequirementsDTOs);
        }
    }
*/
}
