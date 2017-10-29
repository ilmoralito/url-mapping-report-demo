package urlmappingdemo

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        // '/api/employees'(resources: 'employee') {
        //     collection {
        //         '/search'(controller: 'employee', action: 'search', method: 'GET')
        //     }
        // }


        group '/api', {
            '/employees'(resources: 'employee') {
                collection {
                    '/search'(controller: 'employee', action: 'search', method: 'GET')
                }
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
