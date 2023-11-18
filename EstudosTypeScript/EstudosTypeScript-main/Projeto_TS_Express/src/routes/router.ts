import {Router,Request,Response} from "express"
import { createMovie, findMovieById, getAllMovies, removeMovie, updateMovie } from "../controllers/movieControllers"
import {validate} from "../middleware/handlerValidation"
import { movieCreateValidation } from "../middleware/movieValidation"

const router = Router()

export default router.get("/test", (req:Request, res: Response)=>{

    res.status(200).send("Api Funcionando")
}).post("/movie",createMovie,validate,movieCreateValidation())
.get("/movie/:id",findMovieById)
.get("/movie",getAllMovies)
.delete("/movie/:id",removeMovie)
.patch("/movie/:id",validate,movieCreateValidation(),updateMovie)

