import {Router,Request,Response} from "express"
import { createBalanco, findBalancoById,getAllBalanco, removeBalanco,updateBalanco } from "../controllers/balancoControllers"
import {validate} from "../middleware/handlerValidation"
import { socioCreateValidation } from "../middleware/socioValidation"

const router = Router()

export default router.get("/test", (req:Request, res: Response)=>{

    res.status(200).send("Api Funcionando")
}).post("/balanco",createBalanco)
.get("/balanco/:id",findBalancoById)
.get("/balancos",getAllBalanco)
.delete("/balancos/:id",removeBalanco)

.patch("/balanco/:id",validate,socioCreateValidation(),updateBalanco)

