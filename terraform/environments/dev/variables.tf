variable "gke_username" {
  default     = ""
  description = "gke username"
}
 
variable "gke_password" {
  default     = ""
  description = "gke password"
}

variable "project_id" {
  type = string
  description = "project id"
}

variable "region" {
  type = string
  description = "region"
}

variable "zone" {
  type = string
  description = "zone"
}