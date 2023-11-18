import {Router,Request,Response} from "express"
import { createSocio, getAllSocios, removeSocio, findSocioById,updateSocio} from "../controllers/socioControllers"
import { findMensalidadeById, getAllMensalidades,updateMensalidade } from "../controllers/mensalidadeControllers"
import {validate} from "../middleware/handlerValidation"


const router = Router()

export default router.get("/test", (req:Request, res: Response)=>{

    res.status(200).send("Api Funcionando")
})
.get("/mensalidade/:id",findMensalidadeById)
.get("/mensalidades",getAllMensalidades)
.patch("/mensalidade/:id",updateMensalidade)





