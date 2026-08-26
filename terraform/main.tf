module "resource_group" {
  source              = "./Modules/ResourceGroup"
  resource_group_name = var.resource_group_name
  location            = var.location
}

module "app_service_plan" {
  source              = "./Modules/asp"
  resource_group_name = module.resource_group.resource_group_name
  location            = var.location
  app_service_plan_id = var.app_service_plan_name
}

module "windows_web_app" {
  source              = "./Modules/webApp"
  resource_group_name = module.resource_group.resource_group_name
  app_service_plan_id = module.app_service_plan.app_service_plan_id
  location            = var.location
  web_app_name        = var.web_app_name
}