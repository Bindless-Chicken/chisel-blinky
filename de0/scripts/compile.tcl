#Reference: https://www.intel.com/content/dam/www/programmable/us/en/pdfs/literature/hb/qts/qts_qii52003.pdf

load_package flow
project_open [lindex $quartus(args) 0]
execute_flow -compile