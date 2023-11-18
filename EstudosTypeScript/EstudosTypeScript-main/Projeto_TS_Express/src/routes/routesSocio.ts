import {Router,Request,Response} from "express"
import { createSocio, getAllSocios, removeSocio, findSocioById,updateSocio} from "../controllers/socioControllers"
import {validate} from "../middleware/handlerValidation"
import { socioCreateValidation } from "../middleware/socioValidation"

const router = Router()

export default router.get("/test", (req:Request, res: Response)=>{

    res.status(200).send("Api Funcionando")
}).post("/socio",createSocio,validate,socioCreateValidation())
.get("/socio/:id",findSocioById)
.get("/socio",getAllSocios)
.delete("/socio/:id",removeSocio)

.patch("/socio/:id",validate,socioCreateValidation(),updateSocio)

